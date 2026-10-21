import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

public class test2 extends JFrame{
    public character pers = new character();
    public character2 pers2 = new character2();
    public pause button1 = new pause();
    public pause2 pause2 = new pause2();
    public BufferedImage fon;





    int speed = 1;

    public KeyListener kl = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT && pers.x < 995) {
                pers.x++;
                repaint();
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT && pers.x > 284) {
                pers.x--;
                repaint();
            }
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                speed++;

            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                if (speed > 1) speed--;
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
                if (e.getPoint().x >= 486 && e.getPoint().x <= 794 && e.getPoint().y >= 340 && e.getPoint().y <= 389) {
                    pause2.isVisible = false;
                    repaint();
                }
                else if (e.getPoint().x >= 486 && e.getPoint().x <= 793 && e.getPoint().y >= 404 && e.getPoint().y <= 453) {
                    dispose();
                    new menu();
                }
            }

            if (e.getPoint().x > 1140 && e.getPoint().x < 1268 && e.getPoint().y > 40 && e.getPoint().y < 91) {
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


    test2() throws InterruptedException {
        try {
            fon = ImageIO.read(new File("src/fon.png"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        setVisible(true);
        setSize(1280, 720);
        setTitle("Заголовок окна");
        addKeyListener(kl);
        addMouseListener(ql);





        while (true) {
            if (pers2.y <= 720) {
                pers2.y = pers2.y + speed;
                repaint();
                Thread.sleep(10);
            }
            else {
                Random random = new Random();
                int n = random.nextInt(4);
                pers2.y = -141;
                if (n == 0) {
                    pers2.x = 318;
                }
                else if (n == 1) {
                    pers2.x = 496;
                }
                else if (n == 2) {
                    pers2.x = 684;
                }
                else if (n == 3) {
                    pers2.x = 862;
                }
            }
        }

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

    public static void main(String[] args) throws InterruptedException {
        test2 name = new test2();

    }
}
