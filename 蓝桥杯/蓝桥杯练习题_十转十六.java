package ���ű�����;
/**
 * ������һ���������֣��ж����Ƿ�Ϊ0����Ϊ0������16����ͬ��Ϊ0��
 * ��number��Ϊ0�����16ȡ�࣬��ת����16������Ӧ���ַ���
 * number=number/16,�ظ�����2��3�����ַ�����s���α���ÿһλ��
 * �����ʱ�������������
 */

import java.util.Scanner;

public class ���ű���ϰ��_ʮתʮ�� {
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();
	        int i = 0;
	        char[] S = new char[100];
	        if(number == 0){
	            System.out.print(0);
	        }
	        else{
	            while(number!=0)  
	            {
	                int t=number%16;
	                if(t >=0 && t<10)  
	                {
	                    S[i] = (char)(t+'0');
	                    i++;
	                }
	                else
	                {
	                    S[i] = (char)(t+'A'-10);
	                    i++;
	                }
	                number=number/16;
	            } 
	            
	            for (int j=i-1;j>=0;j--)
	            {  
	                System.out.print(S[j]);
	            }
	        }
	    }
	}   


