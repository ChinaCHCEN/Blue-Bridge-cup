package 蓝桥杯官网;

public class 蓝桥杯练习题_五次方数 {
	public static void main(String[] args)
	{
		int[] arr = new int[10];
		for(int i = 2;i < 1000000;i++)
		{
	    	  int n = i;
	    	  int j = 0;
	    	  while(n != 0)
	    	  {	 
	    		 arr[j] = n%10;
	    		 n = n/10;
	    		 j++;
	    	  }
	    	 int t = 0;
	    	 for(int k = 0; k< j;k++)
	    	 {
	    		 t += arr[k]*arr[k]*arr[k]*arr[k]*arr[k];
	    	 }
//	    	这里的不能用n来和t比较因为n在之前的分割已经不是i了。
	       if(t == i)	
	       {
	    	   System.out.println(i);
	       }
	    }
	}
}
/*
public class Main {
    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = 2; i < 1000000; i++) {
            int m = i;
            int t = 0;
            while (m != 0) {
                a[t] = m % 10;
                m = m / 10;
                t++;
            }
            int sum = 0;
            for (int j = 0; j < t; j++) {
                sum += a[j] * a[j] * a[j] * a[j] * a[j];
            }
            if (sum == i)
                System.out.println(i);
        }
    }
}
*/