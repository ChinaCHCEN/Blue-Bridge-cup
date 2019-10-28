package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_ÌØÊâ»ØÎÄÊı {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 10000; i < 100000; i++)
		{
			int a = i/10000,
				b = (i/1000)%10,
				c = (i/100)%10,
				d = (i/10)%10,
			    e = i%10;
			if((e*10000+d*1000+c*100+b*10+a == i)&&(a+b+c+d+e == num))
			{
				System.out.println(i);
			}
		}
		
		for(int j = 100000; j < 1000000; j++)
		{
			int a = j/100000,
				b = (j/10000)%10,
				c = (j/1000)%10,
				d = (j/100)%10,
			    e = (j/10)%10,
			    f = j%10;
			if((f*100000+e*10000+d*1000+c*100+b*10+a == j)&&(a+b+c+d+e+f == num))
			{
				System.out.println(j);
			}
		}
		
	}
}


