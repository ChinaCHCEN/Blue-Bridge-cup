package À¶ÇÅ±­¹ÙÍø;

import java.util.Arrays;
import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_Êý×ÖºÚ¶´½â·¨¶þ {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		while(sc.hasNext())
		{
			int n = sc.nextInt();
		    int k = 1;
		    int t = n;
	        while((t = min(t)) != 6174)
	       {
	    	k++;
	       }
	       System.out.println(k);
	       
		}
		sc.close();
	}
//		 Scanner sc = new Scanner(System.in);
//	        while (sc.hasNext())
//	        {
//	          int n = sc.nextInt();
//		      int count = 1;
//		      int k = n;
//		      while((k = min(k)) != 6174)
//		      	{
//		          count++;
//		        }
//		            System.out.println(count);
//		    }
//		        sc.close();
//	}
	private static int min(int n) {
		String a = n < 1000 ? "0"+n : String.valueOf(n);
		char[] b = a.toCharArray();
		Arrays.sort(b); 
		
		String b2 = String.valueOf(b);
//		String b2 = toString(b);
		int bs = Integer.valueOf(new StringBuffer(b2).reverse().toString()) - Integer.valueOf(b2);
		
		return bs;
		
	}
	
}
