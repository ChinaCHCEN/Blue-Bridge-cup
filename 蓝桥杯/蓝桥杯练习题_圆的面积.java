package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_Ô²µÄÃæ»ı {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		double pi = Math.PI;
		double s = pi*i*i;
		String str = String.format(("%.7f"),s);
		System.out.println(str);
		
	}
}
