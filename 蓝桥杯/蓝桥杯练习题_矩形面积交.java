package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_¾ØĞÎÃæ»ı½» {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double[][] arr = new double[2][4];
		for(int i = 0; i< 2;i++)
		{
			for(int j = 0; j < 4;j++)
			{
				arr[i][j] =  sc.nextDouble();
			}
		}
		double x1 = min(max(arr[0][0], arr[0][2]), max(arr[1][0], arr[1][2]));
		double x2 = max(min(arr[0][0], arr[0][2]), min(arr[1][0], arr[1][2]));
		double y1 = min(max(arr[0][1], arr[0][3]), max(arr[1][1], arr[1][3]));
		double y2 = max(min(arr[0][1], arr[0][3]), min(arr[1][1], arr[1][3]));
		double width = x1 - x2;
		double length = y1 - y2;
		double s = width * length;
		if (width > 0 && length > 0)
			{
				System.out.printf("%.2f", s);
			}else
			{
				System.out.println("0.00");
			}
	  }

		public static double max(double a, double b)
		 {
		    return ((a > b) ? a : b);
		 }

		public static double min(double a, double b)
		 {
		    return ((a < b) ? a : b);
		 }

	}
