
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class test2 extends JFrame{
    public character pers = new character();
    public character2 pers2 = new character2();
    public BufferedImage fon;

    public KeyListener kl = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && pers.x < 540)
        {
            pers.x++;
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT && pers.x > 150) {
            pers.x--;
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP && pers.y > 28) {
            pers.y--;
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN && pers.y < 310) {
            pers.y++;
            repaint();
        }
            if (e.getKeyCode() == KeyEvent.VK_D && pers2.x < 540)
            {
                pers2.x++;
                repaint();
            }
            if (e.getKeyCode() == KeyEvent.VK_A && pers2.x > 150) {
                pers2.x--;
                repaint();
            }
            if (e.getKeyCode() == KeyEvent.VK_W && pers2.y > 28) {
                pers2.y--;
                repaint();
            }
            if (e.getKeyCode() == KeyEvent.VK_S && pers2.y < 310) {
                pers2.y++;
                repaint();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };

    test2() {
        try {
            fon = ImageIO.read(new File("src/fon.png"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        setVisible(true);
        setSize(800, 450);
        setTitle("Заголовок окна");
        addKeyListener(kl);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.GRAY);
        g.drawImage(fon, 0, 0, this);
        g.drawImage(pers.image, pers.x, pers.y, this);
        g.drawImage(pers2.image, pers2.x, pers2.y, this);




    }

    public static void main(String[] args)
    {
        test2 name = new test2();

    }
}
