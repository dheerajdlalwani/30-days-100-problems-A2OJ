import java.util.*;


public class LunchRush {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int maxJoy = 0;
        int currFun, currTime, currJoy, maxJoyRest;
        for(int i = 0; i < n; i++)
        {
            currFun = sc.nextInt();
            currTime = sc.nextInt();
            if(currTime > t)
            {
                currJoy = currFun - currTime + t;
            }
            else
            {
                currJoy = currFun;
            }
            if(i == 0)
            {
                maxJoy = currJoy;
                maxJoyRest = 0;
            }
            else if(maxJoy < currJoy)
            {
                maxJoy = currJoy;
                maxJoyRest = i;
            }
        }
        System.out.println(maxJoy);

    }    
}

