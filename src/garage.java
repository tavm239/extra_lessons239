import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class garage {
    public static int x;
    public static int y;
    public static boolean isVisible;
    public static BufferedImage image;

    garage() //конструктор класса
    {
        x = 20;
        y = 300;
        isVisible = true;
        try {
            image = ImageIO.read(new File("src/garage.png"));
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
