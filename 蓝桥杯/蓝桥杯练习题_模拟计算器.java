package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_ģ������� {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		String d = in.next();
		char c = d.charAt(0);
		if(c == '+')
		{
			System.out.println(a+b);
		}else if(c == '-')
		{
			System.out.println(a-b);
		}else if(c == '*')
		{
			System.out.println(a*b);
		}else if(c == '/')
		{
			System.out.println(a/b);
		}else if(c == '%')
		{
			System.out.println(a%b);
		}
	}
}

