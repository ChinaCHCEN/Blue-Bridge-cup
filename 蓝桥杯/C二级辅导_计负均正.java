package 蓝桥杯官网;

import java.util.Scanner;

public class C二级辅导_计负均正 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double[] a = new double[20];
		double sum = 0,d = 0;
		int k = 0;
		for(int i = 0 ; i < 20; i++)
		{
			a[i] = sc.nextDouble();
			if(a[i] < 0 )
			{
				k++;
			}else{
				d++;
				sum += a[i];
			}
		}
		double t = sum/d;
//		System.err.println(sum+" "+d+" "+sum/d);
		System.out.println(k);
		System.out.printf("%.2f",t);
	}
}
