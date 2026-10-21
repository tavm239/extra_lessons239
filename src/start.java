import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class start {
    public static int x;
    public static int y;
    public static boolean isVisible;
    public static BufferedImage image;

    start() //конструктор класса
    {
        x = 10;
        y = 330;
        isVisible = true;
        try {
            image = ImageIO.read(new File("src/start.png"));
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
