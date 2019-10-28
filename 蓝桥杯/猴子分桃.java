package 蓝桥杯官网;
/**
猴子分桃：海滩上有一堆桃子，五只猴子来分。 
第一只猴子把这堆桃子平均分为五份，多了一个， 
这只猴子把多的一个扔入海中，拿走了一份。 
第二只猴子把剩下的桃子又平均分成五份，又多了一个， 
它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子 
都是这样做的，问海滩上原来最少有多 少个桃子
 */
public class 猴子分桃 {
	public static void main(String[] args)
	{
		int monkey = 1; //要分桃的猴子数
		int peaches = 1; //桃子的总数
		int peach = 1; //每次分桃的总数
		while(monkey <= 5)
		{
			//如果分桃成功
			if(peach%5 == 1&&peach/5 !=0)
			{
				//可分桃的总数为现在的4/5
				peach = (peach/5)*4;
				monkey++;
			}
			//如果失败，重新分桃
			else {
				peaches++;
				peach = peaches;
				monkey = 1;
			}
		}
		System.out.println(peaches);
	}
}
