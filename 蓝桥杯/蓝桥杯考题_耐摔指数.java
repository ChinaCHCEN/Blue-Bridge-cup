package ���ű�����;

import java.util.Scanner;

public class ���ű�����_��ˤָ�� {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println(DroppingPhone(3,sc.nextLong()));
	}
	private static long DroppingPhone(long phone, long floors) {
		// TODO Auto-generated method stub
		long times = 1;
		while(DroppingMax(phone,times) < floors) 
		{
			++times;
		}
		return times;
	}
	//tiemsΪ������phoneΪ�ֻ���
	private static long DroppingMax(long phone, long times) { 
		// TODO Auto-generated method stub
		if(phone == 1)
		{
			return times;
		}
		if(phone >= times)
		{
			return (long)Math.pow(2, times) - 1;
		}
//		����һ�Σ��ֻ����䣬������1���ֻ���һ��������һ��
		return DroppingMax(phone,times - 1)+ DroppingMax(phone - 1,times - 1 )+1;
	}
	
}
