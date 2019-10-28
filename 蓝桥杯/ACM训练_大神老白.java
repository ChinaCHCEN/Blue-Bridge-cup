package 蓝桥杯官网;

import java.util.Scanner;

public class ACM训练_大神老白 {
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
//			如果这里题目要求跳行，那这里必须要用\n不能用直接用System.out.println();
//			System.out.println("\n");
		}
	}
}
