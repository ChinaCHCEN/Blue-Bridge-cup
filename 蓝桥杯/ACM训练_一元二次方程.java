package ���ű�����;

import java.util.Scanner;

public class ACMѵ��_һԪ���η��� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double d = Math.sqrt(b*b-4*a*c);
		double x1 = (-b+d)/(2*a);
		double x2 = (-b-d)/(2*a);
		System.out.printf("%.2f",x1);
		System.out.print(" ");
		System.out.printf("%.2f",x2);
	}
}
