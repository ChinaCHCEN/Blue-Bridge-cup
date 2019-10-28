package 蓝桥杯官网;

/**
 * 由给出的前几层可以看出规律：第一层为1个，然后每层的煤球数量是上一层的数量再加上层数个，设层数为n，层数对应的煤球数为Sn 则：
 * 	Sn = if(n == 1) output: 1;
 *       if(n >= 2) 		S(n-1)+n;
 *
 */
public class 蓝桥杯考题_煤球数量 {
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
