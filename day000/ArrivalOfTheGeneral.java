import java.util.*;

public class ArrivalOfTheGeneral {
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
			int n=sc.nextInt();
			int soliders[]=new int[n];
			int max=0,min=0,count=0;
			for(int i=0;i<n;i++)
			{
				soliders[i]=sc.nextInt();
				if(soliders[i]>soliders[max])
					max=i;
				if(soliders[i]<=soliders[min])
					min=i;
			}
			if(min<max)
			{
				count=max+(n-min-2);
			}
			else
			{
				count=max+(n-1-min);
			}
			
			System.out.println(count);
		}
} 