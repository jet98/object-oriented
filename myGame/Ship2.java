import javax.swing.*;

public class Ship2 extends GameObject{  
  public Ship2(int x, int y, int w, int h, int dX, int dY){
    super("ship", "./ship2.png", x, y, w, h, dX, dY);
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
    if(c == 'w'){
      if(m_y >= 10 && m_y <= 210){
        m_y -= 5;
      }
      else
        m_y = 15;
    }
    if(c == 's'){
      if(m_y >= 10 && m_y <= 210){
        m_y += 5;
      }
      else
        m_y = 210;
    }
  }
}
