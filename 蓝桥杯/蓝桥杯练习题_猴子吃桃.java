package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_���ӳ��� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		int a = 1;
		int t = 0;
		for(int i = 1; i< n;i++)
		{   
			t = 0;
		    t = (a+1)*2; 
		    a = t;  
		}
		System.out.println(a);
	}
}
