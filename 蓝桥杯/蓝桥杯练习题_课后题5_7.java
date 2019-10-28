package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_¿ÎºóÌâ5_7{
	public static void main(String[] ager)
	{
		Scanner ic = new Scanner(System.in);
	    String n = ic.nextLine();
	    char[] a = new char[n.length()];
	   System.out.println(n.length());
	   for(int i = 0; i< n.length();i++)
	   {
		   a[i] = n.charAt(i);
		   System.out.print(a[i]+" ");
	   }  
	   System.out.println(); 
	   for(int i = n.length()-1; i >= 0; i--)
	   {
		   System.out.print(a[i]);
	   }
//	    StringBuilder Builder = new StringBuilder();
//	    System.out.println(Builder.append(n).reverse());
	   StringBuilder Builder = new StringBuilder();
	   System.out.println(Builder.append(n).reverse());
	}
}
