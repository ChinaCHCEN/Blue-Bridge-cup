package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_Fibonacci���� {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int n1 = 1,n2 = 1,n3 = 1;
		if(a > 2)
		{
			for(int i = 3; i <=a; i++)
			{
				n3 = (n1 + n2)%10007;
				n1 = n2;
				n2 = n3;
			}
		}
		System.out.println(n3);
}
}

