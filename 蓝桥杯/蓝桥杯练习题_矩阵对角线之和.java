package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_¾ØÕó¶Ô½ÇÏßÖ®ºÍ {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		
		for(int i = 0;i < 3; i++)
		{
			for(int j = 0; j<3;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		int t = a[0][0]+a[1][1]+a[2][2];
		System.out.print(t+" ");
		int t1 = a[0][2]+a[1][1]+a[2][0];
		System.out.println(t1);
	}
}	
