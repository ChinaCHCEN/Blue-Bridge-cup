package 蓝桥杯官网;
/**
 * 超出限制，数字太大。
 */
import java.util.Scanner;

public class 蓝桥杯练习题_找素数 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    long n = sc.nextLong();
		long m = sc.nextLong();
		long t = 0;
		for(long i = n;i <= m;i++)
		{
			for(long j = 2; j<= i;j++)
			{
				if(i %j == 0&& i != j)
					break;
				else if(i == j)
						t++;
				
			}
		}
		System.out.println(t);
	}
}
