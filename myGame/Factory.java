import java.lang.reflect.Constructor;
import java.util.*;

public class Factory implements IFactory
{
  private static IFactory m_instance;
  public static IFactory getInstance()
  {
    if (m_instance == null)
      m_instance = new Factory();
    return m_instance;
  }
  private Factory() {}

  @Override
  public IGameObject createEnemy(String name, int x, int y, int w, int h, int dX, int dY)
  {
    GameObject m = null;
    try{
      Class c = Class.forName(name);
      Constructor con = c.getConstructor(int.class, int.class, int.class, int.class, int.class, int.class);
      m = (GameObject)con.newInstance(x, y, w, h, dX, dY);
    }
    catch(Exception e){
      throw new Error("Class not found");
    }
    return m;
  }

  @Override
  public IGameObject createHero(String name, int x, int y, int w, int h, int dX, int dY)
  {
    GameObject m = null;
    try{
      Class c = Class.forName(name);
      Constructor con = c.getConstructor(int.class, int.class, int.class, int.class, int.class, int.class);
      m = (GameObject)con.newInstance(x, y, w, h, dX, dY);
    }
    catch(Exception e){
      throw new Error("Class not found");
    }
    return m;
  }
  
  @Override
  public IGameObject createLaser(int x, int y, int w, int h, int dX, int dY)
  {
    return new Laser(x, y, w, h, dX, dY);
  }

  @Override
  public IGameView createMainView(List<IGameObject> objects)
  {
    return new GameView(objects);
  }

  @Override
  public IGameView createStatusView(List<IGameObject> objects)
  {
    return new StatusView(objects);
  }
  
  @Override
  public IGameView createBackgroundView(List<IGameObject> objects){
    return new BackgroundView(objects);
  }

  @Override
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views)
  {
    return new GameController(interval, objects, views);
  }
  
  @Override
  public IGameObject makeCopy(IGameObject x){
    return x;
  }
}
