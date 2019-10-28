package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class ACMÑµÁ·_±£Áô×ÖÄ¸ {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char[] arr = n.toCharArray();
		for(int i = 0; i< arr.length; i++)
		{
			if(arr[i] >='A'&&arr[i]<='Z'||arr[i]>='a'&&arr[i]<='z')
			{
				System.out.print(arr[i]);
			}else {
				continue;
			}
		}
	}
}
