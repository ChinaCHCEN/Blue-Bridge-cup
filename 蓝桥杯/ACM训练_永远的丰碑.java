package À¶ÇÅ±­¹ÙÍø;

import java.util.Arrays;
import java.util.Scanner;

public class ACMÑµÁ·_ÓÀÔ¶µÄ·á±® {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			if(n == 0)
			{
				break;
			}
			int[] arr = new int[n];
			for(int i = 0; i<n;i++)
			{
			   arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[n-1]);
		}
	}
}
