package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_��ҩ {
	 static int T;//��ʱ��
	    static int[] t;//�ɲ�ҩ��ʱ��
	    static int[] M;//��ҩ��ֵ
	    static int[][] v;
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String[] sarr = scanner.nextLine().split(" ");
	        T = Integer.parseInt(sarr[0]);
	        t= new int[Integer.parseInt(sarr[1])];
	        M = new int[t.length];
	 
	        for (int i = 0; i < t.length; i++) {
	            sarr = scanner.nextLine().split(" ");
	            t[i] = Integer.parseInt(sarr[0]);
	            M[i] = Integer.parseInt(sarr[1]);	        
	        }
	        k();
	    }
	 
	    static void k() {
	        int[] b = new int[T + 1]; 
	        for(int i = 0; i <t.length; i++) {
	            for(int j = T; j >= t[i]; j--) {
	                // b[j]= Math.max(b[j], b[j-t[i]]+M[i]);
	                if(b[j - t[i]] + M[i] > b[j]) {
	                    b[j] = b[j -t[i]] + M[i];
	                }
	            }
	        }
	        System.out.println(b[T]);// max
	    }
	}

