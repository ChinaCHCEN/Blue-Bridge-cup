package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_²éÕÒÕûÊı {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] F = new int[n];
		for(int i = 0; i < n ; i++)
		{
			F[i] = in.nextInt();
		}
		int m = in.nextInt();
		for(int j = 0; j < n ;j++)
		{
			if(F[j] == m)
			{
				System.out.println(j+1);
				break;
			}
			else if(m!=F[j]&&j == n-1)
			 {
				System.out.println(-1);
				break;
			}
		}
	}
}
