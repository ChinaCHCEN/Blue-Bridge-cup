package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_Ê±¼ä×ª»» {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		int h = (int) (n/3600);
		int m = (int) ((n-h*3600)/60);
		int s = (int) (n-h*3600-m*60);
		
		System.out.println(h+":"+m+":"+s);
	}
}
