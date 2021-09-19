import java.util.*;

public class Chips {
        public static void main(String [] args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int i = 0;
            boolean brokeAtIf = false;
            while(m > 0)
            {
                for(i = 1; i <= n; i++)
                {
                    if(m-i<0)
                    {
                        // System.out.println("Broke at if");
                        brokeAtIf=true;
                        break;
                    }
                    else
                    {
                        m -= i;
                        // System.out.println("m = " + m);   
                    }   
                }
                if(brokeAtIf)
                {
                    break;
                }
            }
            System.out.println(m);
        }
}
