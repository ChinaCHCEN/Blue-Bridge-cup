package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_��ĸͼ�� {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
//				�ؼ�
				char c = (char) (Math.abs(i-j)+'A');
				
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
