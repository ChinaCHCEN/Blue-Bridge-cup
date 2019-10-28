package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_ÊıÁĞÅÅĞò{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int[] F = new int[i];
		for(int a = 0; a < i; a++)
		{
			F[a] = in.nextInt();
		}
		for(int b = 0; b < i-1; b++)
		{
			for(int c = 0; c < i-1-b; c++)
			{
				if(F[c+1] < F[c])
				{
					int test = F[c+1];
					F[c+1] = F[c];
					F[c] = test;
				}
			}
		}
		for(int d = 0 ; d < i; d++)
		{
			System.out.println(F[d]+" ");
		}
	}
}
