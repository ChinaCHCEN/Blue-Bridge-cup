package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯考题_等腰三角形 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = sc.nextInt();
		int sum = 1+(n-1) * 2 + (2 * n - 3);
//		int sum =2*n-1+n-1+n-2 ;
		
//		1+(n-1)*2为底边的长度（2*n-3)为俩条边减去重合的数字的总长度。
//		2*n-1为底边的长度，n-1+n-2为俩边的长度
		
		String str = "";
		for(int i = 1; str.length() < sum; i++)
		{
//			valueOf是将int类型的数据转变为String类型
			str += String.valueOf(i);			
		}
/**
 * 这里截取字符串很重要，关乎下面的输出。  因为刚开始是从1开始添加的，而在等腰三角形中最后一位是重合的。
 */
		char[] ch = str.substring(0,sum).toCharArray();
		
//		第一行
		for(int j = 0; j < n - 1 ; j++)
		{
			System.out.print(".");
		}
		System.out.println(1);
		
//		从第二行到第n-1行
		for(int i = 1;i < n-1;i++)
		{
			for(int j = 0;j < n - i - 1;j++)
			{
				System.out.print(".");
			}
			System.out.print(ch[i]);
			for(int j = 0; j < i*2-1;j++)
			{
				System.out.print(".");
			}
//			因为数字是已经排好的，位置已经是固定号的。
			System.out.println(ch[sum - i]);
		}
		
//		第n行 。因为第n行的数字是n所有在数组中是n-1.
		for(int i = n -1 ;i < sum - n +2;i++)
		{
			System.out.print(ch[i]);
		}
		
	}
}
