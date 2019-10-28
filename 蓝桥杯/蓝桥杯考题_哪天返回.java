package 蓝桥杯官网;

/**
 * 他第一天的工钱是1元，for循环是从0开始的。
 * 
 * @author 20436
 *
 */
public class 蓝桥杯考题_哪天返回 {
	public static void main(String[] args)
	{
		int index = 1; //第一天的工钱是1元
		int sum = 0;	//总和达到108元
		int i ;
		for( i = 0; sum < 108; i++)
		{
			sum = sum + index; 
			index = index+2;
		}
		System.out.println(i);   
	}
}
