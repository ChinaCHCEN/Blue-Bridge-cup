package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_É¾³ıÊı×éÖĞµÄ0ÔªËØ {
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int[] a = new int[n];
			int j = 0;
			for(int i = 0;i < n;i++)
			{
				 a[i] = in.nextInt();
			}
			for(int i = 0;i< n;i++)
			{
				if(a[i] > 0)
				{
					j++;
					System.out.print(a[i]+" ");
				}
			}
			System.out.println();
			System.out.println(j);
			
		}
}
