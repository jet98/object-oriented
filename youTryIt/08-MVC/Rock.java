public class Rock extends GameObject
{
  public Rock(int x, int y, int w, int h, int dX, int dY)
  {
    super("./Rock_02_preview-150x150.png", x, y, w, h, dX, dY);
  }

  @Override
  public void tick(int maxw, int maxh)
  {
    m_x = m_x + m_dX;
    m_y = m_y + m_dY;
  }

}