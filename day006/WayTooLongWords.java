import java.util.*;

public class WayTooLongWords {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        StringBuilder input = new StringBuilder();
        for(int i = 0; i < t; i++)
        {
            input = new StringBuilder(sc.nextLine());
            int n = input.length();
            if(n > 10)
            {
                System.out.println(Character.toString(input.charAt(0))+ (n-2) + Character.toString(input.charAt(n-1)));
            }
            else
            {
                System.out.println(input.toString());
            }
        }
    }
}
