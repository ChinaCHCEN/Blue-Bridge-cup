package ���ű�����;

import java.math.BigInteger;
import java.util.Scanner;
/**
2.add(b);		     ���
3.subtract(); ���
4.multiply(); ���
5.divide(); ���ȡ��
6.remainder(); ȡ��
7.pow(); a.pow(b)=a^b
8.gcd(); ���Լ��
9.abs(); ����ֵ
10.negate(); ȡ����
11.mod(); a.mod(b)=a%b=a.remainder(b);
12.max(); min();
13.punlic int comareTo();
14.boolean equals(); �Ƿ����
 *
 */
public class ACMѵ��_����ķԸ� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) //BigInteger���Ե�ֵ����ʹString���͵�����
		{
			/*
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
			*/
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			System.out.println(a.add(b));
			
//			subtract(); ���
//			4.multiply(); ���
//			5.divide(); ���ȡ��
			
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
