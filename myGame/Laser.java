public class Laser extends GameObject{
  boolean shoot = false;
  
  public Laser(){}
  
  public Laser(int x, int y, int w, int h, int dX, int dY){
    super("laser", "./laser.png", x, y, w, h, dX, dY);
  }
  
  @Override
  public void tick(int maxw, int maxh){
    if(shoot){
      m_y -= 5;
    }
    if(m_y < -20){
      shoot = false;
      m_y = 250;
    }
  }
  
  @Override
  public void keyPressed(char c){
    if(c == 'k'){
      shoot = true;
    }
  }
  
  public void setX(int x){
    m_x = x + 10;
  }
}
