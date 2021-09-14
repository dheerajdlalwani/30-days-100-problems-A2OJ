import java.util.*;
import java.io.*;

public class HQ9Plus {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int i = 0;
        int flag = 0;
        for(i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == 'H' || input.charAt(i) == 'Q' || input.charAt(i) == '9')
            {
                System.out.println("YES");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("NO");
        }
    }
}
