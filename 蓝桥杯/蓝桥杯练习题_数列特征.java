package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_ÊıÁĞÌØÕ÷ {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
	    int[] F = new int[m]; 
	    int num = 0;
		for(int i = 0; i <F.length; i++)
		{
			F[i] = in.nextInt();
			num += F[i];
		}
		for(int a = 0;a < m-1; a++)
		{
			for(int b = 0; b < m-a-1; b++ )
			{
				if(F[b+1] < F[b])
				{
					int test = F[b+1];
					F[b+1] = F[b];
					F[b] = test; 
				}
			}
		}
	
		System.out.println(F[m-1]);
		System.out.println(F[0]);
		System.out.println(num);
		
		
	}
}
