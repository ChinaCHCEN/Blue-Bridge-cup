package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_¼ôµ¶Ê¯Í·²¼ {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		fun(a,b);
	}

	private static void fun(int a, int b) {
		if(a == 0)
		{
			if(b == 1)
			{
				System.out.println(-1);
			}else if(b == 2)
			{
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}else if(a == 1)
		{
			if(b == 1)
			{
				System.out.println(0);
			}else if(b == 2)
			{
				System.out.println(-1);
			}else {
				System.out.println(1);
			}
		}
		else {
			if(b == 1)
			{
				System.out.println(1);
			}else if(b == 2)
			{
				System.out.println(0);
			}else {
				System.out.println(-1);
			}
		}
	}
}
