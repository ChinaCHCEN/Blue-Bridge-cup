package ���ű�����;

import java.util.Scanner;

public class C��������_�ֶκ��� {
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
