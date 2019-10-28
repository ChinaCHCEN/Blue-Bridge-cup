package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_统计字母数字空格 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char a[] = n.toCharArray();
		int a1 = 0, a2 = 0, a3 = 0,a4 = 0;
		for(int i = 0; i< n.length();i++)
		{
			if(a[i] >='a'&&a[i]<='z'||a[i]>='A'&&a[i]<='Z')	//字符串中字母的个数
			    a1++;
			else if(a[i]>='0' &&a[i]<='9')//字符串中数字的个数
				a2++;
			else if(a[i] == ' ') //字符串中空格的个数
				a3++;
			else       //字符串中特殊字符的个数
				a4++;     
		}
		System.out.print(a1+" "+a2+" "+a3+" "+a4);
	}
}

