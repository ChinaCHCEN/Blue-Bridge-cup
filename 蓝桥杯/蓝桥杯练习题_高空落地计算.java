package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_�߿���ؼ��� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float m = sc.nextInt();
		float n = sc.nextInt();
		float l = m;
		float t = 0;
		for(int i = 1; i<= n; i++)
		{
		   m = m/2;
		   if(i != n) {
		   l += 2*m;
		   }else {
		
		   }
		}
		System.out.printf("%.2f",m);
		System.out.print(" ");
		System.out.printf("%.2f",l);
		
	}
}
