package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_��������Ԥ�� {

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
			    sleep = s;// ������Ϣ
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
  int v1 = sc.nextInt(); //���ӵ��ٶ�
  int v2 = sc.nextInt(); //�ڹ���ٶ�
  int t = sc.nextInt();  // �������ȵľ���
  int s = sc.nextInt();  //������Ϣ��ʱ��
  int l = sc.nextInt();  //�ܵ��ܳ���
  int tu = 0;
  int gui = 0;
  int sleep = 0;
  boolean flag = false;
  for(int i = 1; ;i++){
   // �ж��ڹ������֮��ľ���
   if(!flag && tu-gui>=t){
    sleep = s;// ������Ϣ
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
   // �ж��Ƿ������ѵ��յ�
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
