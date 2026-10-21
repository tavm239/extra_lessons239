import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class control {
    public static int x;
    public static int y;
    public static boolean isVisible;
    public static BufferedImage image;

    control() //конструктор класса
    {
        x = 275;
        y = 440;
        isVisible = true;
        try {
            image = ImageIO.read(new File("src/control.png"));
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
