import java.util.*;

public class Cakeminator {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int r = 0, c = 0;
        char cake[][] = new char[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            String currRow = sc.next();
            for(int j = 0; j < columns; j++)
            {
                cake[i][j] = currRow.charAt(j);
            }
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                if(cake[i][j] == 'S')
                {
                    r++;
                    break;
                }
            }
        }
        for(int j = 0; j < columns; j++)
        {
            for(int i = 0; i < rows; i++)
            {
                if(cake[i][j] == 'S')
                {
                    c++;
                    break;
                }
            }
        }
        System.out.println((rows*columns)-(r*c));
    }
}