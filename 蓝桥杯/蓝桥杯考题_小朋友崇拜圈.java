package ���ű�����;
/**
 * 	List<Integer> list = new ArrayList<>();
 * 	�б�Ӧ�ã�https://blog.csdn.net/oschina_41884158/article/details/81985718
 * 
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ���ű�����_С���ѳ��Ȧ {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i < n;i++)
		{
			nums[i] = sc.nextInt();
		}
		int max = 0;
//		�ȼ��ڣ�for(int v = 0;v < nums.length; v++)
		for(int v: nums)
		{
//			С���ѳ�ݵ��˿����������next
			List<Integer> list = new ArrayList<>();
			int cnt = 0;
			int i = v;
//		�ж�list����û�������i��С���ѡ�����list.contains()�����ж��Ƿ���� ���б����Ƿ����i,
			while(!list.contains(i)) 
			{
//				���С���ѳ�ݵ���
				list.add(i);
//				�ҵ���ǰС���ѳ�ݵ���.��Ϊÿ��С��������ݵĶ������������ֱߡ�
				i = nums[i-1];
				cnt++;
				if(cnt > max)
				{
					max = cnt;
				}
			}
		}
		System.out.println(max);
	}
}
