import java.util.*;


public class StonesOnTheTable {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        String input = sc.next();
        for(int i = 0; i < n-1; i++)
        {
            if(input.charAt(i) == input.charAt(i+1))
            {
                count++;
            }
        }
        System.out.println(count);
    }    
}
