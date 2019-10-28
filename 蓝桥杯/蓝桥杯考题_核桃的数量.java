package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯考题_核桃的数量 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int n = 0;
		int k = 0;
		for(int i = 2; i <= Math.min(a, b); i++)
		{
			if(a%i == 0&&b%i == 0)	//最后的i  是会出现a,b的最大公因数。
			{
				k = a*b/i;
			}
		}
		if(k == 0)
		{
			k = a*b;
		}
		for(int j = 2;j <= Math.min(k, c); j++)
		{
			if(k%j == 0&&c%j == 0)
			{
				n = k*c/j;
			}
		}
		if(n == 0)
		{
			n = k*c;
		}
		System.out.println(n);
	}
}
