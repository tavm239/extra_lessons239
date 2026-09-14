import java.awt.*;

public class Main extends Frame {

    public Main()
    {
        setTitle("first drawing");
        setSize(800, 640);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D isa = (Graphics2D) g;
        g.setColor(Color.YELLOW);
        g.drawOval(100, 100, 50, 50);
        g.setColor(Color.YELLOW);
        //g.drawRect(500,200, 300, 100);
        g.drawLine(150,125, 175, 125);
        g.drawLine(100,125, 75, 125);
        g.drawLine(125,150, 125, 175);
        g.drawLine(125,100, 125, 75);
        g.drawLine(145,145, 165, 165);
        g.drawLine(110,145, 85, 165);
        g.drawLine(145,108, 165, 90);
        g.drawLine(110,108, 85, 90);

    }

      public static void main(String[] args) {
          //System.out.println("Hello and welcome!");
          new Main();
      }

}