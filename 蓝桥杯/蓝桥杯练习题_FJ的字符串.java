package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_FJ���ַ��� {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(fun(n));
	}

	private static String fun(int n) 
	{
		if(n == 1)
		{
			return "A";
		}
		else {
			return fun(n-1)+(char)('A'+n-1)+fun(n-1);
		}
	}
}
