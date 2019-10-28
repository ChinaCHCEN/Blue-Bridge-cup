package 蓝桥杯官网;

import java.util.Scanner;

public class C二级辅导_统计字符 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int a1 = 0,a2 = 0,a3 = 0,a4 = 0;
	    char[] a = n.toCharArray();
	    for(int i = 0; i< a.length; i++)
	    {
	    	if(a[i] >='a'&&a[i]<='z'||a[i]>='A'&&a[i]<='Z')
	    	{
	    		a1++;
	    	}else if(a[i] ==' ')
	    	{
	    		a2++;
	    	}else if(a[i]>='0'&&a[i]<='9')
	    	{
	    		a3++;
	    	}else {
	    		a4++;
	    	}
	    }
	    System.out.println(a1+"\n"+a2+"\n"+a3+"\n"+a4);
	}
}
