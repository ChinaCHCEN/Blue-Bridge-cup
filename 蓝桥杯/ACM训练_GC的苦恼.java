package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class ACMÑµÁ·_GCµÄ¿àÄÕ {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int a = sc.nextInt();
			if(a >=90 &&a <= 100)
			{
			System.out.println("A");	
			}else if(a >=75 &&a <= 89)
			{
				System.out.println("B");
			}else if(a >= 60&&a <= 74)
			{
				System.out.println("C");
			}else if(a >=0&&a <=59)
			{
				System.out.println("D");
			}else {
				System.out.println("Error!");
			}
		}
	}

}
