package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_ºËÌÒµÄÊıÁ¿ {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int n = 0;
		int k = 0;
		for(int i = 2;i <= Math.min(a,b);i++)
		{
			if(a%i == 0 && b%i == 0)
			{
				n = a*b/i;
			}
		}
		if(n == 0)
		{
			n = a*b;
		}
		for(int j = 2; j <= Math.min(n, c); j++)
		{
			if(n%j == 0&& c%j == 0)
			{
				k = n*c/j;
			}
		}
		if(k == 0)
		{
			k = n*c;
		}
		System.out.println(k);
	}
}
