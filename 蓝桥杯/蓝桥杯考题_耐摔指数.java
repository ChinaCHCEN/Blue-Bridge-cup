package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯考题_耐摔指数 {
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
	//tiems为次数，phone为手机数
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
//		测试一次，手机不变，次数减1；手机减一，次数减一。
		return DroppingMax(phone,times - 1)+ DroppingMax(phone - 1,times - 1 )+1;
	}
	
}
