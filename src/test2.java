
import javax.swing.*;
import java.awt.*;

public class test2 extends JFrame{

    test2()
    {
        setVisible(true);
        setSize(800, 600);
        setTitle("Заголовок окна");
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.GRAY);
        g.drawLine(100,100,200,100);
        g.drawLine(100,100,100,200);
        g.drawLine(100,200,200,200);
        g.drawLine(200,100,200,200);
        g.setColor(Color.GRAY);
        g.drawLine(100,100,150,50);
        g.drawLine(200,100,150,50);
        g.setColor(Color.GRAY);
        g.drawLine(175,75,175,70);
        g.drawLine(180,80,180,70);
        g.drawLine(175,70,180,70);
        g.drawRect(125,145,25,55);
        g.drawRect(165,120,25,20);



    }

    public static void main(String[] args)
    {
        test2 name = new test2();

    }
}
