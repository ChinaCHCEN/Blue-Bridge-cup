package ���ű�����;

import java.util.Scanner;
/**
 * ˼·���⣺
 * 	 https://blog.csdn.net/qq_41923622/article/details/85207046
 *
 */
public class ���ű���ϰ��_K_������ {
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
