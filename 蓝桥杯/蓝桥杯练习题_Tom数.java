package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_Tom数 {
	public static void main(String[] args)
	{
		int num = 0;
		Scanner sr = new Scanner(System.in);
		try
		{
		while(sr.hasNext())
		{
			//将char数组的各个元素相加，在减去‘0’（char类型）的0，或者  48（int类型）
			char[] n = sr.next().toCharArray();
			
			for(int i = 0; i<n.length;i++ )
			{
//				 num += n[i]-48;//整数减去48，char类型减去‘0’
				num += n[i]-'0';
			}

			System.out.println(num);
			num = 0;
		}
	}catch (Exception e) 
	 {
		System.out.println("no");
	 }
	}
}
