import java.util.*;

public interface IFactory
{
  public IGameObject createEnemy(String name, int x, int y, int w, int h, int dX, int dY);
  public IGameObject createHero(String name, int x, int y, int w, int h, int dX, int dY);
  public IGameObject createLaser(int x, int y, int w, int h, int dX, int dY);
  public IGameObject makeCopy(IGameObject x);
  public IGameView createMainView(List<IGameObject> objects);
  public IGameView createStatusView(List<IGameObject> objects);
  public IGameView createBackgroundView(List<IGameObject> objects);
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views);
}
