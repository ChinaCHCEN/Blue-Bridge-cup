package À¶ÇÅ±­¹ÙÍø;


import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_The3n {
	    public static int count(int num) {
	        int c=1;
	        while(true) {
	            if(num==1) return c;
	            if(num%2!=0) {
	                num = 3*num+1;
	            }else {
	                num=num/2;
	            }
	            c++;
	        }
	    }
	    public static void main(String args[]) {
	        int max=0;
	        int m,n,x;
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()) {
	            max=0;
	            m=in.nextInt();
	            n=in.nextInt();
	            boolean flag = false;
	            if(m>n) {
	                int temp =m;
	                m=n;
	                n=temp;
	                flag = true;
	            }
	            for(int i=m;i<=n;i++)
	            {
	                if((x=count(i))>max) max = x;
	            }

	            if(flag) {
	                System.out.println(n+" "+m+" "+max);
	            }else {
	                System.out.println(m+" "+n+" "+max);
	            }
	        }
	    }
	}
