package ���ű�����;

import java.util.Scanner;

public class ���ű�����_���������� {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = sc.nextInt();
		int sum = 1+(n-1) * 2 + (2 * n - 3);
//		int sum =2*n-1+n-1+n-2 ;
		
//		1+(n-1)*2Ϊ�ױߵĳ��ȣ�2*n-3)Ϊ�����߼�ȥ�غϵ����ֵ��ܳ��ȡ�
//		2*n-1Ϊ�ױߵĳ��ȣ�n-1+n-2Ϊ���ߵĳ���
		
		String str = "";
		for(int i = 1; str.length() < sum; i++)
		{
//			valueOf�ǽ�int���͵�����ת��ΪString����
			str += String.valueOf(i);			
		}
/**
 * �����ȡ�ַ�������Ҫ���غ�����������  ��Ϊ�տ�ʼ�Ǵ�1��ʼ��ӵģ����ڵ��������������һλ���غϵġ�
 */
		char[] ch = str.substring(0,sum).toCharArray();
		
//		��һ��
		for(int j = 0; j < n - 1 ; j++)
		{
			System.out.print(".");
		}
		System.out.println(1);
		
//		�ӵڶ��е���n-1��
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
//			��Ϊ�������Ѿ��źõģ�λ���Ѿ��ǹ̶��ŵġ�
			System.out.println(ch[sum - i]);
		}
		
//		��n�� ����Ϊ��n�е�������n��������������n-1.
		for(int i = n -1 ;i < sum - n +2;i++)
		{
			System.out.print(ch[i]);
		}
		
	}
}
