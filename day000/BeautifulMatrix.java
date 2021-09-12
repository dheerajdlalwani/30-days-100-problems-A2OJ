import java.util.*;
public class BeautifulMatrix {
    public static void main(String [] args)
    {
        int i = -1;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while(n == 0)
        {
            n = sc.nextInt();
            i++;
        }
        System.out.println(Math.abs(i/5-2) + Math.abs(i%5-2));
    }
}
