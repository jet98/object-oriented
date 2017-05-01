import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class MyGame extends JFrame
{
  public static void main(String args[])
  {
    JFrame frame = new MyGame();
    frame.setVisible(true);
  }

  public MyGame()
  {
    super("Game Engine Example");
    setSize(400, 330);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    int interval = 100;

    // model
    List<IGameObject> objects = new ArrayList<IGameObject>();
    List<IGameObject> enemies = new ArrayList<IGameObject>();
    Setup setup = new Setup();
    objects.add(Factory.getInstance().createHero(setup.getHero(), 180, 210, 40, 40, 5, 5));
    objects.add(Factory.getInstance().createEnemy(setup.getEnemy1(), 10, 10, 30, 30, 5, 5));
    objects.add(Factory.getInstance().createEnemy(setup.getEnemy2(), 10, 10, 30, 30, 5, 5));
      
    // view
    IGameView view = Factory.getInstance().createMainView(objects);
    IGameView statusView = Factory.getInstance().createStatusView(objects);
    IGameView pointsView = Factory.getInstance().createBackgroundView(objects);
    List<IGameView> views = new ArrayList<IGameView>();
    views.add(view);
    views.add(statusView);
    views.add(pointsView);

    // controller
    IGameController controller = Factory.getInstance().createController(interval, objects, views);

    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(view.getJPanel(), BorderLayout.CENTER);
    getContentPane().add(statusView.getJPanel(), BorderLayout.SOUTH);
    getContentPane().add(pointsView.getJPanel(), BorderLayout.NORTH);

    controller.startGame();
  }
}
