package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_用筛选法求N之内的素数解法二 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int m = 2;m <= n;m++)
		{
			int k = 1;
			for(int i = 2;i < m;i++)
			{
				if(m%i == 0)
				{
					k = 0;
				}
			}
			if(k!= 0)
			{
			   System.out.println(m);
			}
		}
	}
}
