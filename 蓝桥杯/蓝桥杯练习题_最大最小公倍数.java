package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_最大最小公倍数 {
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long test = 0;
//		n小于2，无法取出三位数，所以不符合题意
		if(n <= 2){
		
		}
//		这里为奇数
		if(n%2 == 1){ 
			 test = n*(n-1)*(n-2);
			 System.out.println(test);
//	    这里的else就代表下面的数都代表偶数
		}else { 
//			这里的n%3是为了保证能够取出三位数。
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
        if(n <= 2)  //此时最多只能选择两个数，不符合题意
            return;
        if(n % 2 == 1) {
            result = n * (n - 1) * (n - 2);    
        } else {
            if(n % 3 == 0)  //说明n和n - 3有最大公约数3
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