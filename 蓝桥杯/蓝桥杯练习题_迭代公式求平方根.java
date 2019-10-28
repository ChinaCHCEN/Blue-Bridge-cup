package 蓝桥杯官网;

import java.util.Scanner;
/**
String类的format()方法用于创建格式化的字符串以及连接多个字符串对象。
 熟悉C语言的同学应该记得C语言的sprintf()方法，两者有类似之处。format()方法有两种重载形式。
format(String format, Object... args) 
新字符串使用本地语言环境，制定字符串格式和参数生成格式化的新字符串。
format(Locale locale, String format, Object... args)
 使用指定的语言环境，制定字符串格式和参数生成格式化的字符串。
 *
 */
public class 蓝桥杯练习题_迭代公式求平方根
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) 
		{
			double a = scanner.nextInt();
			double x, y=a;   
			for(int i=1;i>0;i++)
	           {
			       x = y;
			       y  = (x + a / x) / 2;
			       if(Math.abs(x-y)<1e-6) //1e-6的意思就是1*10的-6次方
			       break;
			   }
		System.out.printf(String.format("%.3f", y));
		}
	}	    
}

