package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_Quadratic_Equation {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		double x1 = 0;
		double x2 = 0;
		   x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		   x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		   if(x1>x2){
		    System.out.printf("%.2f %.2f",x1,x2);
		   }else if(x1<x2){
		    System.out.printf("%.2f %.2f",x2,x1);
		   }else{
		  System.out.printf("%.2f",x1);
		   }
	}
}
