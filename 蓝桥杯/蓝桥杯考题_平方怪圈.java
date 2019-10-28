package À¶ÇÅ±­¹ÙÍø;

import java.util.Arrays;

public class À¶ÇÅ±­¿¼Ìâ_Æ½·½¹ÖÈ¦ {
	public static void main(String[] args)
	{
		int i = 0,s = 80;
		int[] a = new int[50];
		for( i = 0;i < 50; i++)
		{
			a[i] = s;
			int bai = s/100,shi = (s/10)%10,ge = s%10;
			s = bai * bai + shi *shi + ge * ge;
		}
		Arrays.sort(a);
		System.out.println(a[49]);
	}
}
