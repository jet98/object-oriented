import java.security.SecureRandom;

public class Asteroid extends GameObject{
  public Asteroid(int x, int y, int w, int h, int dX, int dY){
    super("asteroid", "./asteroid.png", x, y, w, h, dX, dY);
  }
  
  @Override
  public void tick(int maxw, int maxh){
    SecureRandom r = new SecureRandom();
    m_x = m_x + m_dX;
    m_y = m_y + m_dY;
    if(m_x > maxw){
      int x = r.nextInt(7) - 7;
      int y = r.nextInt(7) + 3;
      int l = r.nextInt(maxw);
      m_x = l;
      m_y = 10;
      m_dX = x;
      m_dY = y;
    }
    if(m_x < 0){
      int x = r.nextInt(7) - 7;
      int y = r.nextInt(7) + 3;
      int l = r.nextInt(maxw);
      m_x = l;
      m_y = 10;
      m_dX = x;
      m_dY = y;
    }
  }
}
