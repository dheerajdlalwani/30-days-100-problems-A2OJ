import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
    
        String number1 = sc.nextLine();
        String number2 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < number1.length(); i++)
        {
            if(number1.charAt(i) == number2.charAt(i))
            {
                sb.append('0');
            }
            else
            {
                sb.append('1');
            }
        }

        System.out.println(sb.toString());
    }
}