package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_�ַ��� {
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		if(a.compareTo(b) > 0)
		{
			System.out.println(1);
		}else if(a.compareTo(b) < 0){
			System.out.println(-1);
		}else{
			System.out.println(0);
		}	
	}
}
