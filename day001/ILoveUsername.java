import java.util.*;

public class ILoveUsername {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int performances[] = new int[n];
        int largest, smallest, amazing;
        for(int i = 0; i < n; i++)
        {
            performances[i] = sc.nextInt();
        }
        largest = performances[0];
        smallest = performances[0];
        amazing = 0;
        for(int i = 0; i < n; i++)
        {
            if(largest < performances[i])
            {
                largest = performances[i];
                amazing++;
            }
            else if(smallest > performances[i])
            {
                smallest = performances[i];
                amazing++;
            }
        }
        System.out.println(amazing);
    }
}
