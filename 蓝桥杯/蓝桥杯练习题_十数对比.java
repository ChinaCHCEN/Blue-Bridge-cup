package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_ʮ���Ա� {
		static int a[]=new int[10];
	    public static void f1() {
	        Scanner in=new Scanner(System.in);
	        for(int i=0;i<10;i++) {
	            a[i]=in.nextInt();
	        }
	    }
	    public static void handle() {
	        int min=a[0];
	        int swap_min=0;
	        for(int i=0;i<10;i++) {
	            if(min>a[i]) {
	                min=a[i];
	                swap_min=i;//�洢��Сiԭ����λ��
	            }
	        }
	        a[swap_min]=a[0];
	        a[0]=min;
	         
	        int max=a[0];
	        int swap_max=0;
	        for(int i=0;i<10;i++) 
	        {
	            if(max<a[i])
	            {
	                max=a[i];
	                swap_max=i;//�洢���iԭ����λ��
	            }
	        }
	        a[swap_max]=a[9];
	        a[9]=max;
	        for(int i=0;i<10;i++) 
	        {
	            System.out.print(a[i]+" ");
	        }
	    }
	    public static void main(String[] args) {
	        f1();
	        handle();
	    }
    }
 
