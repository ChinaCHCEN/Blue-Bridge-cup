package ���ű�����;

import java.util.Arrays;
import java.util.Scanner;

public class ACMѵ��_��������ɱ����� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n;i++)
			{
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			for(int i = n-1;i >=0 ;i--)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}
}
