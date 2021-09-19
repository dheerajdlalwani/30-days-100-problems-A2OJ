import java.util.*;


public class Tram {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int maxPassengers = 0;
        int passengersInside = 0;
        int passengersArriving;
        int passengersDeparting;
        for(i = 1; i <= n; i++)
        {
            passengersDeparting = sc.nextInt();
            passengersArriving = sc.nextInt();
            passengersInside -= passengersDeparting;
            passengersInside += passengersArriving;
            if(maxPassengers < passengersInside)
            {
                maxPassengers = passengersInside;
            }
        }
        System.out.println(maxPassengers);
    }    
}
