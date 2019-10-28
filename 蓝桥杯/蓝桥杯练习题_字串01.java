package À¶ÇÅ±­¹ÙÍø;

public class À¶ÇÅ±­Á·Ï°Ìâ_×Ö´®01 {
	public static void main(String[] args)
	{
		int i = 0;
		int a = i % 100000,
		    b = i % 10000,
		    c = i % 1000,
		    d = i % 100,
		    e = i % 10;
		for(a = 0; a < 2; a++)
		{
			for(b = 0; b <2 ; b++)
			{
				for(c = 0; c < 2; c++)
				{
					for(d = 0; d < 2; d++)
					{
						for(e = 0; e < 2; e++)
						{
							System.out.println(a+""+b+""+c+""+d+""+e);
						}
					}
				}
			}
		}
	}
}
