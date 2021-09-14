import java.util.*;


public class Cookies {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cookieBags[] = new int[n];
        int odds, total;
        odds = 0;
        total = 0;
        for(int i = 0; i < n; i++)
        {
            cookieBags[i] = sc.nextInt();
            if(cookieBags[i]%2 != 0)
            {
                odds++;
            }
            total += cookieBags[i];
        }
        if(total%2!=0)
        {
            System.out.println(odds);
        }
        else
        {
            System.out.println(n-odds);
        }
    }
}






// C1 10:15 AM