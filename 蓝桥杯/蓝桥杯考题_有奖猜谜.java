package ���ű�����;

public class ���ű�����_�н����� {
	public static void main(String[] args)
	{
		String input = "vxvxvxvxvxvxvvx";
		int i = 0;
		int num = 777;
		for(i = 0; i < input.length(); i++)
		{
			char a = input.charAt(i);
			if(a == 'v')
			{
				num *= 2;
			}else {
				num -= 555;
			}
		}
		System.out.println(num);
	}
}
