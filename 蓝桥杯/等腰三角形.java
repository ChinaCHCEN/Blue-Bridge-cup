package ���ű�����;

import java.util.Scanner;

public class ���������� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 1+(n-1)*2+(2*n)-3;
		String a = "";
		for(int i = 1; i< sum;i++)
		{
			a += String.valueOf(i);
		}
		
		char[] ch = a.substring(0, sum).toCharArray();
		
//		��һ��
		for(int i = 0; i< n-1;i++)
		{
			System.out.print(".");
		}
		System.out.println(1);
		
//		�ڶ��е�n-1��
	    for(int i = 1; i< n -1;i++)
	    {
		   for(int j = 0;j < n-i-1; j++)
		   {
			System.out.print(".");
		   }
		   System.out.print(ch[i]);
		   for(int j = 0;j < i*2 -1; j++)
		   {
			  System.out.print(".");
		   }
		  System.out.println(ch[sum-i]);
	    }
//	    ���һ��
	    for(int i = n-1; i < sum-n+2;i++)
	    {
	    	System.out.print(ch[i]);
	    }
	}
}
