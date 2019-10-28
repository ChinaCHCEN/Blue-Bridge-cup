package À¶ÇÅ±­¹ÙÍø;

public class À¶ÇÅ±­¿¼Ìâ_´ÕËãÊ½ {
		public static void main(String[] args)
		{
			int a=0,b = 0,c= 0,d = 0,e=0,f=0,i=0,h=0,g=0;
			int num = 0;
			for(a = 1;a <= 9;a++)
			{                                                
				for(b = 1;b<=9;b++)
				{
					for(c= 1;c<=9;c++)
					{
						for(d = 1; d<= 9;d++)
						{
							for(e = 1; e<= 9;e++)
							{
								for(f = 1;f<=9;f++)
								{
									for(i = 1;i<=9;i++)
									{
										for(g = 1;g<=9;g++)
										{
											for(h = 1;h<=9;h++)
											{
												if(10*c*(100*g+10*h+i)==a*b*(100*d+10*e+f)&&a!=b&&a!=c&&a!=d&&a!=e&&a!=f&&a!=i&&a!=h&&a!=g
														&&b!=c&&b!=d&&b!=e&&b!=f&&b!=i&&b!=h&&b!=g&&c!=d&&c!=e&&c!=f&&c!=f&&c!=i&&c!=h&&c!=g
														&&d!=e&&d!=f&&d!=i&&d!=h&&d!=g&&e!=f&&e!=f&&e!=i&&e!=h&&e!=g&&f!=i&&f!=h&&f!=g&&i!=h&&i!=g&&h!=g
														)
												{
//													System.out.println(10*c*(100*g+10*h+i)+" "+a*b*(100*d+10*e+f));
													num++;
												}

											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.println(num);
		}
}
