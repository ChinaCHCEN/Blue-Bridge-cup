package ���ű�����;

/**
 * �ɸ�����ǰ������Կ������ɣ���һ��Ϊ1����Ȼ��ÿ���ú����������һ��������ټ��ϲ������������Ϊn��������Ӧ��ú����ΪSn ��
 * 	Sn = if(n == 1) output: 1;
 *       if(n >= 2) 		S(n-1)+n;
 *
 */
public class ���ű�����_ú������ {
	public static void main(String[] args)
	{
	 int cont = 0;
	 for(int  i = 1;i <= 100; i++)
	 {
		 for(int j = 1; j <= i; j++)
		 {
			 cont += j;
		 }
	 }
	   System.out.println(cont); 
	}
}
