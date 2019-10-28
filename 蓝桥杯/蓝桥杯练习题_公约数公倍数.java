package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_公约数公倍数 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = 0,t = 0;
		for(int i = 1;i < Math.min(a, b); i++)
		{
			if(a%i == 0&&b%i == 0)
			{
			 k = a*b/i;	
			 t = i;
			}
		}
		if(k == 0)
		{
			k = a*b;
		}
		System.out.print(t +" "+k );
	}
}
