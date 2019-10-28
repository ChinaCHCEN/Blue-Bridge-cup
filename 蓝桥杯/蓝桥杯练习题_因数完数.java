package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_因数完数 {
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
