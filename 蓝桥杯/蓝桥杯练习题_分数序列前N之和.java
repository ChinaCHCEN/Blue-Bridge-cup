package ���ű�����;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ���ű���ϰ��_��������ǰN֮�� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float a = 2.0f;
		float b = 1.0f;
		float c = 0.0f;
		float t = 0;
		for(int i = 1; i <= n;i++)
		{
		    t += a/b;
//		    System.out.print(t+" ");
		    c = a;
		    a = a+b;
		    b = c;
		}
		System.out.printf("%.2f",t);
//		DecimalFormat fnum = new DecimalFormat("##0.00");
//      String str = fnum.format(t);
//      System.out.println(str);
	}
}
