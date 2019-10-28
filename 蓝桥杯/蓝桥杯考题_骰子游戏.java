package ю╤ге╠╜╧ымЬ;

public class ю╤ге╠╜©╪лБ_В╩вссно╥ {
	public static void main(String[] args)
	{
		int i = 0,j =0,k = 0;
		int n = 0,t = 6*6*6;
		for(i = 1; i <= 6; i++)
		{
			for(j = 1; j <= 6;j ++)
			{
				for(k = 1; k <= 6;k++)
				{
					if(i + j == k || i + k == j || j + k == i)
					{
						n++;
					}	
				}
			}
		}
		
		int m = YX(n,t);
		System.out.println(n/m+"/"+t/m);
	}

public static int YX(int n, int m) {
		if(m == 0)
			return n;
		return YX(m,n%m);
	}
}
