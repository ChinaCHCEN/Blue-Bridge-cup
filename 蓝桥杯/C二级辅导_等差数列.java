package ���ű�����;

import java.util.Scanner;

public class C��������_�Ȳ����� {
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
