import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class pause {
    public static int x;
    public static int y;
    public static boolean isVisible;
    public static BufferedImage image;

    pause() //конструктор класса
    {
        x = 710;
        y = 40;
        isVisible = true;
        try {
            image = ImageIO.read(new File("src/pause.png"));
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
