package À¶ÇÅ±­¹ÙÍø;

public class À¶ÇÅ±­Á·Ï°Ìâ_ÌØÊâµÄÊı×Ö {
	public static void main(String[] args)
	{
		for(int i = 100; i < 1000; i++)
		{
			int a = i/100,
				b = (i/10)%10,
			    c = i%10;
			if(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c, 3) == i)
			{
				System.out.println(i);
			}
		}
	}
}
