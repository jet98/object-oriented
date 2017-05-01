import javax.swing.*;
import java.util.List;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameView extends JPanel implements IGameView
{
    private List<IGameObject> m_objects;
    private IGameObject collide;
    private int hitBox = 20;

    public GameView(List<IGameObject> objects)
    {
      setOpaque(true);
      setIgnoreRepaint(true);
      setFocusable(true);
      requestFocusInWindow();
      m_objects = objects;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Image bufferedImage = createImage(getWidth(), getHeight());
        Graphics2D buffer = (Graphics2D) bufferedImage.getGraphics();
        
        for(IGameObject obj : m_objects){
          if(obj.getName() == "ship"){
            collide = obj;
          }
        }
        for (IGameObject obj : m_objects)
        {
          buffer.drawImage(obj.getImage(), obj.getX(), obj.getY(), obj.getW(), obj.getH(), this);
        }

        g.drawImage(bufferedImage, 0, 0, this);
    }

    @Override
    public void tick()
    {
      for(IGameObject obj : m_objects){
        if(obj.getName() != collide.getName()){
          if(obj.getY() < collide.getY() + hitBox && obj.getY() > collide.getY() - hitBox){
            if(obj.getX() < collide.getX() + hitBox && obj.getX() > collide.getX() - hitBox){
              this.setVisible(false);
            }
          }
        }
        else{
          repaint();
        }
      }
    }

    @Override
    public JPanel getJPanel()
    { return this; }


}
