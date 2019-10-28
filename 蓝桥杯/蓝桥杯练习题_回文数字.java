package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_»ØÎÄÊı×Ö {
	public static void main(String[] args)
	{int num = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(long i = 10000;i < 100000;i++)
		{
			long a = i/10000;
			long b = (i/1000)%10;
			long c = (i/100)%10;
			long d = (i/10)%10;
			long e = i%10;
			if(a == e&& b == d&&(a+b+c+d+e)== n)
			{
				num = 1;
				System.out.println(i);
			}
		}
		for(long i = 100000;i < 1000000;i++)
		{
			long a = i/100000;
			long b = (i/10000)%10;
			long c = (i/1000)%10;
			long d = (i/100)%10;
			long e = (i/10)%10;
			long f = i%10;
			if(a == f&& b == e&&c == d&&(a+b+c+d+e+f)== n)
			{
				num = 1;
				System.out.println(i);
			} 
			
		}
		if(num == 0)
		{
		System.out.println(-1);	
		}
		
	}
}
