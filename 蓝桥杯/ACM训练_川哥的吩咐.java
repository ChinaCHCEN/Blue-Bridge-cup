package 蓝桥杯官网;

import java.math.BigInteger;
import java.util.Scanner;
/**
2.add(b);		     相加
3.subtract(); 相减
4.multiply(); 相乘
5.divide(); 相除取整
6.remainder(); 取余
7.pow(); a.pow(b)=a^b
8.gcd(); 最大公约数
9.abs(); 绝对值
10.negate(); 取反数
11.mod(); a.mod(b)=a%b=a.remainder(b);
12.max(); min();
13.punlic int comareTo();
14.boolean equals(); 是否相等
 *
 */
public class ACM训练_川哥的吩咐 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) //BigInteger可以的值可以使String类型的数据
		{
			/*
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
			*/
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			System.out.println(a.add(b));
			
//			subtract(); 相减
//			4.multiply(); 相乘
//			5.divide(); 相除取整
			
		}
	}
}
/*
 * 
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
while(in.hasNext()) {
BigInteger a = in.nextBigInteger();
BigInteger b = in.nextBigInteger();
System.out.println(a.add(b));
}
}

}*/
