package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_十数对比 {
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
	                swap_min=i;//存储最小i原来的位置
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
	                swap_max=i;//存储最大i原来的位置
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
 
