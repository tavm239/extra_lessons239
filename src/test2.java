import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class test2 extends JFrame{
    public character pers = new character();
    public character2 pers2 = new character2();
    public pause button1 = new pause();
    public pause2 pause2 = new pause2();
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


    MouseListener ql = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {

            if (pause2.isVisible) {
                if (e.getPoint().x > 300 && e.getPoint().x < 500 && e.getPoint().y > 210 && e.getPoint().y < 245) {
                    pause2.isVisible = false;
                    repaint();
                }
                else if (e.getPoint().x > 300 && e.getPoint().x < 500 && e.getPoint().y > 250 && e.getPoint().y < 285) {
                    dispose();
                    new menu();
                }
            }

            if (e.getPoint().x > 710 && e.getPoint().x < 790 && e.getPoint().y > 40 && e.getPoint().y < 72) {
                pause2.isVisible = true;
                repaint();
            }
        }



        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

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
        addMouseListener(ql);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.GRAY);
        g.drawImage(fon, 0, 0, this);
        g.drawImage(pers.image, pers.x, pers.y, this);
        g.drawImage(pers2.image, pers2.x, pers2.y, this);
        g.drawImage(button1.image, button1.x, button1.y, this);
        if (pause2.isVisible) g.drawImage(pause2.image, pause2.x, pause2.y, this);




    }

    public static void main(String[] args)
    {
        test2 name = new test2();

    }
}
