package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_���� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 2; i<= n;i++)
		{
			for(int j = 2;j <= i; j++)
			{
				if(i%j == 0&& i!=j)
				{
				   break;
				}
				else if(i == j)
				{
					System.out.println(i);
				}
			}
		}			
	}
}
