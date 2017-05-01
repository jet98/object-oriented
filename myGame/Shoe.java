public class Shoe extends GameObject{
  public Shoe(int x, int y, int w, int h, int dX, int dY){
    super("shoe", "./shoe.png", x, y, w, h, dX, dY);
  }
  
  @Override
  public void tick(int maxw, int maxh){
    m_x = m_x + m_dX;
    m_y = m_y + m_dY;
    if(m_x > maxw-30 || m_x < 0) 
      m_dX = m_dX * -1; 
    if(m_y > maxh-30 || m_y < 0) 
      m_dY = m_dY * -1; 
  }
}
