package 蓝桥杯官网;

public class C二级辅导_同因查找 {
	public static void main(String[] args)
	{
		for(int i = 10; i<= 1000; i++)
		{
			if(i%2 == 0&&i%3 == 0&&i%7 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
