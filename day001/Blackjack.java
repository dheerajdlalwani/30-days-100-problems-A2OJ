import java.util.*;
public class Blackjack {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int x = input - 10;

        if (x == 0)
        {
            System.out.println("0");
        }
        else if (x >= 2 && x <= 9)
        {
            System.out.println("4");
        }
        else if(x == 10)
        {
            System.out.println("15");
        }
        else if(x == 1 || x == 11)
        {
            System.out.println("4");
        }
        else
        {
            System.out.println("0");
        }
    }
}


