package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_�����С������ {
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long test = 0;
//		nС��2���޷�ȡ����λ�������Բ���������
		if(n <= 2){
		
		}
//		����Ϊ����
		if(n%2 == 1){ 
			 test = n*(n-1)*(n-2);
			 System.out.println(test);
//	    �����else�ʹ����������������ż��
		}else { 
//			�����n%3��Ϊ�˱�֤�ܹ�ȡ����λ����
			if(n%3 == 0) {
				test = (n-1)*(n-2)*(n-3);
				System.out.println(test);
			}else {
				test = n*(n-1)*(n-3);
				System.out.println(test);
		}
	}
}
}

/*
import java.util.Scanner;

public class Main {

    public void printResult(long n) {
        long result = 0;
        if(n <= 2)  //��ʱ���ֻ��ѡ��������������������
            return;
        if(n % 2 == 1) {
            result = n * (n - 1) * (n - 2);    
        } else {
            if(n % 3 == 0)  //˵��n��n - 3�����Լ��3
                result = (n - 1) * (n - 2) * (n - 3);
            else
                result = n * (n - 1) * (n - 3);
        }
        System.out.println(result);
        return;
    }
    
    public static void main(String[] args) {
        Main test = new Main();
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        test.printResult(n);
    }
}
*/