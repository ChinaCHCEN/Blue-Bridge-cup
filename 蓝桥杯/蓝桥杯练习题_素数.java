package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_ËØÊı {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 2; i<= n;i++)
		{
			for(int j = 2;j <= i; j++)
			{
				if(i%j == 0&& i!=j)
				{
				   break;
				}
				else if(i == j)
				{
					System.out.println(i);
				}
			}
		}			
	}
}
