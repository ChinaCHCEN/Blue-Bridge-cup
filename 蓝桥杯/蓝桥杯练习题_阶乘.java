package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_�׳� {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long k = 0;
		for(int i = 1;i<= n;i++)
		{
	        k += fun(i);
	    }
		System.out.println(k);
	}
	
	public static int fun(int j) 
	{
		if(j == 1||j == 0)
		{
			return 1;
		}else
		{
			return j*fun(j-1); //������õ�fun(j-1)�ǽ� ͷ�ļ���jҲ��һ��
		}
	}
}

/*
 * 
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
while (scanner.hasNext()) {
long n = scanner.nextInt();
if (n <= 20) {
long Sn = 0;
long a = 1;
for (int i = 1; i <= n; i++) {
a = a * i;
Sn = Sn + a;
}
System.out.print(Sn);
}
}
}
*/