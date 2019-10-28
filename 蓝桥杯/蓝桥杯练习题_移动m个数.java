package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_ÒÆ¶¯m¸öÊı {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n;i++)
		{
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		
		for(int i = a.length-m;i < a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int j = 0;j <a.length-m;j++)
		{
			System.out.print(a[j]+" ");
		}
	}
}
