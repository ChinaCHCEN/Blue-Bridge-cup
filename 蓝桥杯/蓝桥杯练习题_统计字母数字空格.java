package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_ͳ����ĸ���ֿո� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char a[] = n.toCharArray();
		int a1 = 0, a2 = 0, a3 = 0,a4 = 0;
		for(int i = 0; i< n.length();i++)
		{
			if(a[i] >='a'&&a[i]<='z'||a[i]>='A'&&a[i]<='Z')	//�ַ�������ĸ�ĸ���
			    a1++;
			else if(a[i]>='0' &&a[i]<='9')//�ַ��������ֵĸ���
				a2++;
			else if(a[i] == ' ') //�ַ����пո�ĸ���
				a3++;
			else       //�ַ����������ַ��ĸ���
				a4++;     
		}
		System.out.print(a1+" "+a2+" "+a3+" "+a4);
	}
}

