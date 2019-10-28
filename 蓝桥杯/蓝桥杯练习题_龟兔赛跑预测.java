package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_龟兔赛跑预测 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		int l = sc.nextInt();	
		int sleep = 0;
		int tl = 0;
		int gl = 0;
		boolean flag = false;
		for(int i = 1;i <= 10000; i++)
		{  	
			if(!flag && tl-gl>=t){
			    sleep = s;// 兔子休息
			    flag = true;
			   }
			   if(sleep>0){
			    sleep--;
			   }else{
			    flag = false;
			    tl += v1;
			   } 
			   gl += v2;
			   
			if(tl == l || gl == l)
			{
				if(tl == l && gl ==l) 
					System.out.println("D");
				else if(gl == l ) 
					System.out.println("T");
				else if(tl == l) 
					System.out.println("R");
				
				System.out.println(i);
				break;	
	        }
		}
	}
}
/*
 *public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int v1 = sc.nextInt(); //兔子的速度
  int v2 = sc.nextInt(); //乌龟的速度
  int t = sc.nextInt();  // 兔子领先的距离
  int s = sc.nextInt();  //兔子休息的时间
  int l = sc.nextInt();  //跑到总长度
  int tu = 0;
  int gui = 0;
  int sleep = 0;
  boolean flag = false;
  for(int i = 1; ;i++){
   // 判断乌龟和兔子之间的距离
   if(!flag && tu-gui>=t){
    sleep = s;// 兔子休息
    flag = true;
   }
   if(sleep>0){
    sleep--;
   }else{
    flag = false;
    tu += v1;
   }
    
   gui += v2;
//   System.out.println(i+"--"+tu+"--"+gui);
   // 判断是否有人已到终点
   if(tu>=l || gui>=l){
    if(tu>=l&&gui>=l){
     System.out.println("D");
    }else if(tu<l){
     System.out.println("T");
    }else{
     System.out.println("R");
    }
    System.out.println(i);
    break;
   }
  }
 }
}
*/
