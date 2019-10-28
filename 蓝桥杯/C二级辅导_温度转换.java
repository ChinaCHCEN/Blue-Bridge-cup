package 蓝桥杯官网;

import java.util.Scanner;

public class C二级辅导_温度转换 {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double t = n - 32;
		double s = t*5/9;
		System.out.printf("%.2f",s);
		
	}
}
