package 蓝桥杯官网;
/**
 * 	List<Integer> list = new ArrayList<>();
 * 	列表应用：https://blog.csdn.net/oschina_41884158/article/details/81985718
 * 
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 蓝桥杯考题_小朋友崇拜圈 {
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
//		等价于：for(int v = 0;v < nums.length; v++)
		for(int v: nums)
		{
//			小朋友崇拜的人看做是链表的next
			List<Integer> list = new ArrayList<>();
			int cnt = 0;
			int i = v;
//		判断list中有没有这个第i个小朋友。首先list.contains()方法判断是否包含 在列表中是否包含i,
			while(!list.contains(i)) 
			{
//				添加小朋友崇拜的人
				list.add(i);
//				找到当前小朋友崇拜的人.因为每个小朋友所崇拜的对象都在他的右手边。
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
