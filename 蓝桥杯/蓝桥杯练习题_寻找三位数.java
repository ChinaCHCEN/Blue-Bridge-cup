package ���ű�����;

public class ���ű���ϰ��_Ѱ����λ�� {
	public static void main(String[] args)
	{
		for(int i = 123;i < 333;i++) //ȷ��һ��ֵ
		{
			int a = i/100,b = (i/10)%10,c = i%10;
			int[] num = new int[10];
			if(b == 0 ||c == 0)
				continue;
			boolean t = true;
			int num1 = a*100+b*10+c;	//�ٻ�ȡ��������ֵ
			int num2 = num1 * 2;
			int num3 = num1 * 3;
			num[num1/100]++;num[(num1/10)%10]++;num[num1%10]++; //��������ص������Ǹ���һ����ֹ����һ��Ҳ���ǲ�����1
			num[num2/100]++;num[(num2/10)%10]++;num[num2%10]++;
			num[num3/100]++;num[(num3/10)%10]++;num[num3%10]++;
			for(int j = 1 ;j <= 9; j++)
			{
				if(num[j] != 1)
					t = false;
			}
			if(t)
			{
				System.out.println(num1+" "+num2+" "+num3);
			}
		}
		
	}
}
