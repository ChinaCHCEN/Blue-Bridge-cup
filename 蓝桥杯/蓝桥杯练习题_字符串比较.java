package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_×Ö·û´®±È½Ï {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		String d = new String();
		
		if(a.compareTo(b)>0)
		{
			d = a;
			a = b;
			b = d;
		}
		if(a.compareTo(c)>0)
		{
			d = a;
			a = c;
			c = d;
		}
		if(b.compareTo(c)>0)
		{
			d = b;
			b = c;
			c = d;
		}
		System.out.println(a+"\n"+b+"\n"+c+"\n");
	}
}
