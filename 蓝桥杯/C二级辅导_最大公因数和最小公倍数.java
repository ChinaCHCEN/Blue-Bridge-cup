package ���ű�����;

import java.util.Scanner;

public class C��������_�����������С������ {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a = 0;
		int k = 0;
		for( int i = 1; i<= Math.min(m, n);i++)
		{
			if(m%i==0&&n%i==0)
			{
				a = m*n/i;
				k = i;
			}
		}
		if(a==0)
		{
			a = m*n;
		}
		System.out.println(k);
		System.out.println(a);
	}
}
