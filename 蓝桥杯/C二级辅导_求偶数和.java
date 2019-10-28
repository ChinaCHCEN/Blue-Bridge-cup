package 蓝桥杯官网;

import java.util.Scanner;

public class C二级辅导_求偶数和 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for(int i = 0; i< n;i++)
		{
			a[i] = sc.nextInt();
			if(a[i]%2 == 0)
			{
				sum += a[i];
			}
		}
		System.out.println(sum);
	}
}
