package 蓝桥杯官网;
/**
 * 俩个重要的步骤
 * 1: sum += a[i]-'0';	
 *    求和输入的是字符串类型，然后转化为char类型。相加的时候需要 -‘0’这个步骤。
 * 2: a = String.valueOf(sum).toCharArray();
 *     将之前想加的数据sum，重新赋值给数组a。valueOf()方法是将int类型的sum转换位String类型。再将把它分开给char数组a。
 *     	
 */
import java.util.Scanner;

public class 蓝桥杯考题_缩位求和 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		while(true)
		{
			int sum = 0;
			for(int i = 0;i < a.length; i++)
			{
				sum += a[i]-'0';		
			}
			a = String.valueOf(sum).toCharArray();
			if(a.length == 1) {
				System.out.println(a);
				break;
			}
		}
	}
}
