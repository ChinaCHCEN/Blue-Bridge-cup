package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_ÉßĞĞ¾ØÕó {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1,d = 1;
		for(int i = 0; i < n; i++)
		{
			int b = a,c = i+1;
			for(int j = 0;j < n-i; j++)
			{
				System.out.print(b);
				if(j < n-i-1)
				{
				System.out.print(" ");
				}else
				{
				System.out.println();
				}
				c++;
				b += c;
		   }
			a+=d;
			d++;		
	}
}
	
	
/*
public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){	
            int n=cin.nextInt();
            int aa=1,dd=1;
            for(int i=0;i<n;i++)
            {
                int bb=aa,cc=i+1;
                for(int j=0;j<n-i;j++)
                {
                    System.out.print(bb);
                    if(j<n-i-1)
                    	System.out.print(" ");
                    else 
                    	System.out.println();
                    cc++;bb+=cc;
                }
                aa+=dd;dd++;
            }
        }
    }*/

}
	
