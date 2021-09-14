import java.util.*;


public class CandyBags {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = (n*n)/2;
        for(int i = 1; i <= k; i++)
        {
            System.out.print(i + " " + ((n*n) - i + 1) + " ");
            if(i%(n/2) == 0)
            {
                System.out.println();
            }
        }
        
    }    
}