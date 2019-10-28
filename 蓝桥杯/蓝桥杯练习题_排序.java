package À¶ÇÅ±­¹ÙÍø;

import java.util.Arrays;
import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_ÅÅĞò {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] c = new int[10];
	 for(int i = 0; i< 10;i++)
	 {
		  c[i] = sc.nextInt();
	 }
	  Arrays.sort(c);
	  for(int j = 0; j< c.length;j++)
	  {
		  System.out.println(c[j]);
	  }
   }
}
