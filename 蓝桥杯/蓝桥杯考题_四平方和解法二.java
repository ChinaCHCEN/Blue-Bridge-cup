package 蓝桥杯官网;
/**
 * 不完整，方法有欠缺
 */
import java.util.Scanner;

public class 蓝桥杯考题_四平方和解法二 {
	public static void main(String[] args)
	{
		int n,a,b,c;
		int d;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for(a = 0;a<3000;++a)
		{
			for(b = a;b<3000;++b)
			{
				for(c = b;c<3000;++c)
				{
					d = (int) Math.sqrt(n-a*a-b*b-c*c);
					if(n==a*a+b*b+c*c+d*d)
					{
					if(c>d)
						{
						int temp= d;
						d=c;
						c=temp;
						} 					
						System.out.println(a+""+b+""+c+""+d);
						break;
					}
				}
			}
		}
	}
}

