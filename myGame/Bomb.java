import java.security.SecureRandom;

public class Bomb extends GameObject{
  public Bomb(int x, int y, int w, int h, int dX, int dY){
    super("bomb", "./bomb.png", x, y, w, h, dX, dY);
  }
  
  @Override
  public void tick(int maxw, int maxh){
    m_y = m_y + (m_dY * 2);
    SecureRandom rand = new SecureRandom();
    if(m_y > maxh){
      m_y = 0;
      int x = rand.nextInt(maxw) + 1;
      m_x = x;
    }
  }
}
