import java.util.Scanner;
public class test {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //String name_s = in.next();
        //System.out.println(name_s);\
        heart_n(5);
    }

    public static void heart()
    {
       System.out.print('♥') ;
    }

    public static void heart_n(int n)
    {
        for (int i = 1; i <= n; i = i + 1)
        {
            System.out.print('♥') ;
        }
    }
}
