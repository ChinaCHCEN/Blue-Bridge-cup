package ���ű�����;

import java.util.Scanner;

public class ACMѵ��_�����ϰ� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int a = sc.nextInt();
			int sum = 0;
			int[] n = new int[a];
			for(int i = 0;i< a;i++)
			{
				n[i] = sc.nextInt();
				sum += Math.abs(n[i]);
			}
			System.out.println(sum);
//			���������ĿҪ�����У����������Ҫ��\n������ֱ����System.out.println();
//			System.out.println("\n");
		}
	}
}
