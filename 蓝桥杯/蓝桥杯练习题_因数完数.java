package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_�������� {
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();			
			for(int i = 1; i<n;i++)
			{
				int num = 0;
				for(int k = 1; k < i;k++)
				{
					if(i%k == 0)
					{
						num+=k;
					}
				}
			if(num == i)
			{
				System.out.print(i+" its factors are ");
				for(int m = 1; m<i;m++)
				{
					if(i%m == 0)
					{
					System.out.print(m+" ");
					}
				}
				System.out.println();
			}
			
		}
			
	}
}
