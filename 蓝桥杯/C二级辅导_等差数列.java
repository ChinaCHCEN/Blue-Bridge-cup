package 蓝桥杯官网;

import java.util.Scanner;

public class C二级辅导_等差数列 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int k = 2,sum = 0;
		for(int i = 0;i < n;i++)
		{
			t[i] = k;
			k += 3;
			sum += t[i];
		}
		System.out.println(sum);
	}
}
