import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class character2 {
    public static int x;
    public static int y;
    public static boolean isVisible;
    public static BufferedImage image;

    character2() //конструктор класса
    {
        x = 180;
        y = 150;
        isVisible = true;
        try {
            image = ImageIO.read(new File("src/car2.png"));
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
