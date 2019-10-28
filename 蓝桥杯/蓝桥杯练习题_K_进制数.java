package 蓝桥杯官网;

import java.util.Scanner;
/**
 * 思路讲解：
 * 	 https://blog.csdn.net/qq_41923622/article/details/85207046
 *
 */
public class 蓝桥杯练习题_K_进制数 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int res_1 = k-1;
		int res_0 = 1;
		for(int i = 2;i <= n; i++)
		{
			int last = res_1;
			res_1 = (k-1)*(res_1+res_0); 
			res_0 = last;
		}
		System.out.println(res_1);
	}
}
