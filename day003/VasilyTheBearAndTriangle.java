import java.util.*;


public class VasilyTheBearAndTriangle {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = Math.abs(x) + Math.abs(y);
        int x1,y1,x2,y2;
        if(x < 0)
        {
            x1 = (-1) * z;
            y1 = 0;
            x2 = 0;
            if(y < 0)
            {
                y2 = (-1) * z;
            }
            else
            {
                y2 = z;
            }
        }
        else
        {
            x1 = z;
            y1 = 0;
            x2 = 0;
            if(y < 0)
            {
                y2 = (-1) * z;
            }
            else
            {
                y2 = z;
            }
        }
        if(x1 < x2)
        {
            System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);    
        }
        else
        {
            System.out.println(x2 + " " + y2 + " " + x1 + " " + y1);
        }
        
    }
}
