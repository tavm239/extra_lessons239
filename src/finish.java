import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class finish {
    public static int x;
    public static int y;
    public static boolean isVisible;
    public static BufferedImage image;

    finish() //конструктор класса
    {
        x = 20;
        y = 346;
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
