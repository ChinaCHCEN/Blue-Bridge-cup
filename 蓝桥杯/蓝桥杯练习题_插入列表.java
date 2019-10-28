package À¶ÇÅ±­¹ÙÍø;

import java.util.Arrays;
import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_²åÈëÁĞ±í {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i = 0; i<9;i++)
		{
			a[i] = sc.nextInt();
		}
		int n = sc.nextInt();
	    a[9] = n;
	    Arrays.sort(a);
	    for(int j = 0; j< a.length;j++)
	    {
	    	System.out.println(a[j]);
	    }
	}
}
