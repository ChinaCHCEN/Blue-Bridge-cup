package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_Ä¸Å£µÄ¹ÊÊÂ {
	public static int fun(int n) {
		 if(n == 1)
		{
			return 1;
		}else if(n == 2)
		{
			return 2;
		}else if(n == 3)
		{
			return 3;
		}else {
			return fun(n-1)+fun(n-3);
		}	
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int num = 0;
			int n = in.nextInt();
			if(n == 0)
				break;
				
				System.out.println(fun(n));
			}	
		}
	}
