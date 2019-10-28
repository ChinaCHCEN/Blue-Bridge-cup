package 蓝桥杯官网;

public class C二级辅导_阶乘数列 {
	public static void main(String[] args)
	{
		        double sum = 0;
		        double a = 1;
		        for (int i = 1; i <= 30; i++) {
		            a = 1;
		            for (int x = 1; x <= i; x++) {
		                a = a * x;
		            }
		            sum = sum + a;
		        }
		        System.out.printf("%.2e", sum);
		    }
		}