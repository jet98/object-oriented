import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BackgroundView extends JPanel implements IGameView{
  private JLabel m_status = new JLabel();
  List<IGameObject> m_objects;
  private int points = 0;
  private IGameObject collide;
  private int hitBox = 20;
  
  public BackgroundView(List<IGameObject> objects)
  {
    m_objects = objects;
    setLayout(new BorderLayout());
    m_status.setText(Integer.toString(points));
    add(m_status, BorderLayout.NORTH);
    for(IGameObject obj : m_objects){
      if(obj.getName() == "ship"){
        collide = obj;
      }
    }
  }

  @Override
  public void tick()
  {
    if(m_objects.size() > 1){
      m_status.setText(String.format("Points: %s", Integer.toString(++points)));
    }
    for(IGameObject obj : m_objects){
      if(obj.getName() != collide.getName()){
        if(obj.getY() < collide.getY() + hitBox && obj.getY() > collide.getY() - hitBox){
          if(obj.getX() < collide.getX() + hitBox && obj.getX() > collide.getX() - hitBox){
            m_status.setText(String.format("Final Score: %s", Integer.toString(points)));
            try{
              this.wait();
            }
            catch(InterruptedException ie){
              throw new Error("Stopped game didnt work");
            }
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
