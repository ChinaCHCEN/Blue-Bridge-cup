package 蓝桥杯官网;
/**
 *next()和nextLine()的区别详解
 *next()方法在读取内容时，会过滤掉有效字符前面的无效字符，对输入有效字符之前遇到的空格键、
 *Tab键或Enter键等结束符，next()方法会自动将其过滤掉；只有在读取到有效字符之后，
 *next()方法才将其后的空格键、Tab键或Enter键等视为结束符；所以next()方法不能得到带空格的字符串。
 */
 
/*nextLine()方法字面上有扫描一整行的意思，它的结束符只能是Enter键，即nextLine()
 * 方法返回的是Enter键之前没有被读取的所有字符，它是可以得到带空格的字符串的。
 */

import java.util.Scanner;

public class 蓝桥杯练习题_字符串对比 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if(a.length() != b.length())	//长度不相等输出1
		{
			System.out.println(1);
		}
		else if(a.length() == b.length())
		{
			if(a.equals(b))	//长度相等，区分大小写 相等输出2
			{
				System.out.println(2);
			}else {
				if(a.equalsIgnoreCase(b)) //长度相等，不区分大小写相等输出3
				{
					System.out.println(3);
				}else {
					System.out.println(4); //长度相等，不区分大小写不相等输出4
				}
			}
		}
	}
}
