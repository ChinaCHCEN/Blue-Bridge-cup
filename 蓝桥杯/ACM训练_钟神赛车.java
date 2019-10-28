package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class ACMÑµÁ·_ÖÓÉñÈü³µ {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			
		   double num = 0;
			int n = sc.nextInt();
			int[] a = new int[2*n];
			for(int i = 0; i< 2*n;i++)
			{
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++)
			{
					if(a[i+3] > a[i])
					num += 50;
					else if(a[i+3] < a[i])
					num -= 50;
			    }
			if((int)num > 0)
			System.out.println((int)num);
			else
				System.out.println(0);
		    }

			}
	}


