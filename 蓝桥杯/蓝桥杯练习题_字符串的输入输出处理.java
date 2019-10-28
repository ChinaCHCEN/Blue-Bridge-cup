package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_×Ö·û´®µÄÊäÈëÊä³ö´¦Àí {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        for(int i=1;i<=a+1;i++) {
	            String s = sc.nextLine();
	            if(i==1)
	                continue;
	            System.out.println(s+"\n");
	        }
	        while(sc.hasNext()) {
	            String s = sc.nextLine();
	            String x[] = s.split(" ");
	            for(int i=0;i<x.length;i++) {
	                System.out.println(x[i]+"\n");
	            }
	        }
	    }
	}

