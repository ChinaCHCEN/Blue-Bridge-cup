package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_最大公约数最小公倍数 {
	public static void main(String[] args)
	{
		Scanner in =  new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int t = 0,t2 = 0;
		for(int i = 1; i <= Math.min(m, n);i++)
		{
			if(m%i == 0&&n%i == 0)
			{
				t = m*n/i;
				t2 = i;
			}
		}
		if(t == 0)
		{
			t = m*n;
		}
		System.out.println(t2+" "+t);
	}
}
