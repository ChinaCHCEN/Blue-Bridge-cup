package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_��ɸѡ����N֮�ڵ������ⷨ�� {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int m = 2;m <= n;m++)
		{
			int k = 1;
			for(int i = 2;i < m;i++)
			{
				if(m%i == 0)
				{
					k = 0;
				}
			}
			if(k!= 0)
			{
			   System.out.println(m);
			}
		}
	}
}
