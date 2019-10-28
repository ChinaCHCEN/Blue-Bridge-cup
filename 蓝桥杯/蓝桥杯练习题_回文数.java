package À¶ÇÅ±­¹ÙÍø;

public class À¶ÇÅ±­Á·Ï°Ìâ_»ØÎÄÊı {
	public static void main(String[] args)
	{
		for(int i = 1000; i < 10000; i++)
		{
			int a = i/1000,
				b = (i/100)%10,
				c = (i/10)%10,
				d = i%10;
			if(d*1000+c*100+b*10+a == i)
			{
				System.out.println(i);
			}
		}
	}
}
