import java.util.*;


public class QueueAtTheSchool {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String position = sc.next();
        while(t>0)
        {
            StringBuilder positionBuilder = new StringBuilder(position);
            for(int i = 0; i < n-1; i++)
            {
                if(positionBuilder.charAt(i) == 'B' && positionBuilder.charAt(i+1) == 'G')
                {
                    positionBuilder.setCharAt(i, position.charAt(i+1));
                    positionBuilder.setCharAt(i+1, position.charAt(i));
                    position = positionBuilder.toString();
                    i++;
                }
            }
            t--;
        }
        System.out.println(position);
    }    
}
