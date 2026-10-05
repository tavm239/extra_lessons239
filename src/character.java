import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class character {
    public static int x;
    public static int y;
    public static boolean isVisible;
    public static BufferedImage image;

     character() //конструктор класса
    {
        x = 410;
        y = 305;
        isVisible = true;
        try {
            image = ImageIO.read(new File("src/car.png"));
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


