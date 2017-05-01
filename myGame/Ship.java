import javax.swing.*;

public class Ship extends GameObject{  
  public Ship(int x, int y, int w, int h, int dX, int dY){
    super("ship", "./ship.png", x, y, w, h, dX, dY);
  }
  
  @Override
  public void tick(int maxw, int maxh){
  }
  
  @Override
  public void keyPressed(char c){
    if(c == 'a'){
      if(m_x >= 10 && m_x <= 350){
        m_x -= 5;
      }
      else
        m_x = 15;
    }
    if(c == 'd'){
      if(m_x >= 10 && m_x <= 340){
        m_x += 5;
      }
      else
        m_x = 335;
    }
  }
}
