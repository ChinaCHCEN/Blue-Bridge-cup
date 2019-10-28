package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_ÌÕÌÕÕªÆ»¹û {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int t = 0;
		for(int i = 0; i < 10; i++)
		{
			a[i] = sc.nextInt();
		}
		int n = sc.nextInt();
	    for(int i = 0 ;i< a.length; i++)
	    {
	    	if(n+30 >= a[i])
	    	{
	    		t++;
	    	}
	    }
	    System.out.println(t);
	}
}
