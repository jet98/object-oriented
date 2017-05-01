import javax.swing.*;
import java.awt.BorderLayout;
import java.util.*;

class StatusView extends JPanel implements IGameView
{
  private JLabel m_status = new JLabel();
  List<IGameObject> m_objects;
  private IGameObject collide;
  private int hitBox = 20;
  
  public StatusView(List<IGameObject> objects)
  {
    m_objects = objects;
    setLayout(new BorderLayout());
    m_status.setText("");
    add(m_status, BorderLayout.CENTER);
    for(IGameObject obj : m_objects){
      if(obj.getName() == "ship"){
        collide = obj;
      }
    }
  }

  @Override
  public void tick()
  {
    if (m_objects.size()> 1)
    {
        m_status.setText(String.format("<html>Use A to move left, D to move Right to try and avoid the Enemies,"
                + "Ship2 can use W to move up and S to move down</html>"));
    }
    for(IGameObject obj : m_objects){
      if(obj.getName() != collide.getName()){
        if(obj.getY() < collide.getY() + hitBox && obj.getY() > collide.getY() - hitBox){
          if(obj.getX() < collide.getX() + hitBox && obj.getX() > collide.getX() - hitBox){
            this.setVisible(false);
          }
        }
      }
    }
  }

  @Override
  public JPanel getJPanel()
  {
    return this;
  }
}
