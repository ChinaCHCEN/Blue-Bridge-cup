package 蓝桥杯官网;

import java.util.Scanner;

public class C二级辅导_分段函数 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
		if(x < 1)
		{
			System.out.printf("%.2f",x);
			System.out.println();
		}else if(x >=1 && x < 10)
		{
			double y = 2*x-1;
			System.out.printf("%.2f",y);
			System.out.println();
		}else if(x >= 10)
		{
			double y = 3*x - 11;
			System.out.printf("%.2f",y);
			System.out.println();
		}
	}
}
