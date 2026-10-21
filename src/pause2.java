import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class pause2 {
    public static int x;
    public static int y;
    public static boolean isVisible;
    public static BufferedImage image;

    pause2() //конструктор класса
    {
        x = 384;
        y = 216;
        isVisible = false;
        try {
            image = ImageIO.read(new File("src/pause2.png"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



    public static void move(int dx, int dy)
    {
        x-=dx;
        y-=dy;
    }
}
