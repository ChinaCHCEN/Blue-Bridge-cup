package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_Minesweeper {
	
	public static void main(String[] args)
	{
	    Scanner cin=new Scanner(System.in);
        int num=1;
        while(cin.hasNext()){
            int a=cin.nextInt();
            int b=cin.nextInt();
            if(a==0&&b==0)
            	break;
            String []n=new String[a];
            for(int i=0;i<a;i++)
            {
               n[i]=cin.next();
            }
            System.out.println("Field #"+num+":");
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<b;j++)
                {
                    int s=0;
                    if(n[i].charAt(j)=='*')
             // �ҵ�ָ���ַ�����λ�õ��ַ�
                    	System.out.print(n[i].charAt(j));
                    else 
                    {
                        if(i!=0&&n[i-1].charAt(j)=='*')  s++;	//���Ϸ�
                        if(i!=0&&j!=0&&n[i-1].charAt(j-1)=='*') s++; //���Ϸ�
                        if(i!=0&&j!=b-1&&n[i-1].charAt(j+1)=='*') s++;//���Ϸ�
                        if(j!=0&&n[i].charAt(j-1)=='*') s++;//���
                        if(j!=b-1&&n[i].charAt(j+1)=='*') s++;//�ұ�
                        if(i!=a-1&&n[i+1].charAt(j)=='*') s++;//���·�
                        if(j!=0&&i!=a-1&&n[i+1].charAt(j-1)=='*') s++;//���½�
                        if(j!=b-1&&i!=a-1&&n[i+1].charAt(j+1)=='*') s++;//���½�
                        System.out.print(s);
                    }
                }
                System.out.println();
            }
            System.out.println();
            num++;
        }
	}
}
