package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_TorrydeµÄÀ§»ó {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int all=0;
        long sum=1;
        for(int a=2;;a++)
        {
            int tem=a;
            for(int b=2;b*b<=a;b++)
            {
                if(a%b==0)
                {
                    tem=1;
                    break;
                }
            }
            if(tem!=1)
            {
                sum=(sum*tem%50000)%50000;
                all++;
            }
            if(all==n) break;
        }
        System.out.println(sum);
	}
}
