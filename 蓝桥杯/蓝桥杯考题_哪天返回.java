package ���ű�����;

/**
 * ����һ��Ĺ�Ǯ��1Ԫ��forѭ���Ǵ�0��ʼ�ġ�
 * 
 * @author 20436
 *
 */
public class ���ű�����_���췵�� {
	public static void main(String[] args)
	{
		int index = 1; //��һ��Ĺ�Ǯ��1Ԫ
		int sum = 0;	//�ܺʹﵽ108Ԫ
		int i ;
		for( i = 0; sum < 108; i++)
		{
			sum = sum + index; 
			index = index+2;
		}
		System.out.println(i);   
	}
}
