package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_×ÖÄ¸Í¼ĞÎ {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
//				¹Ø¼ü
				char c = (char) (Math.abs(i-j)+'A');
				
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
