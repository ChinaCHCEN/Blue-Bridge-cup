package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class ACMÑµÁ·_³Â½ÌÖ÷µÄÈý½ÇÐÎ {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a+b>=c&&b+c>=a&&a+c>=b)
			{
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
