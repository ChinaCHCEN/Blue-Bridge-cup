package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_阶乘 {

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
			return j*fun(j-1); //这里调用的fun(j-1)是将 头文件的j也减一了
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