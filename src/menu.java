import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

import static java.lang.System.exit;

public class menu extends JFrame{
    public start button1 = new start();
    public control button2 = new control();
    public garage button3 = new garage();
    public finish button4 = new finish();
    public BufferedImage fon;


    MouseListener ml = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getPoint().x > 10 && e.getPoint().x < 230 && e.getPoint().y > 220 && e.getPoint().y < 266 ) {
                dispose();
                new test2();
            }
            else if (e.getPoint().x > 20 && e.getPoint().x < 50 && e.getPoint().y > 346 && e.getPoint().y < 400 ) {
                System.exit(0);
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

    menu() {
        try {
            fon = ImageIO.read(new File("src/fon2menu.png"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        setVisible(true);
        setSize(800, 450);
        setTitle("Заголовок окна");
        addMouseListener(ml);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.GRAY);
        g.drawImage(fon, 0, 0, this);
        g.drawImage(button1.image, button1.x, button1.y, this);
        g.drawImage(button2.image, button2.x, button2.y, this);
        g.drawImage(button3.image, button3.x, button3.y, this);
        g.drawImage(button4.image, button4.x, button4.y, this);


    }

    public static void main(String[] args)
    {
        menu name = new menu();

    }
}
