package 蓝桥杯官网;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 蓝桥杯练习题_错误票据 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		  int n = input.nextInt();
	        ArrayList<Integer> arrayList = new ArrayList<Integer>();
	        String string = new String();
	        input.nextLine();
	        for (int i=0; i<n; i++) {
	            string = input.nextLine();
	            string = string.trim();	//去除俩段空格
//	            String[] strings = string.split(" ");
	            String[] strings = string.split("\\s+");    //去除空格
	            //将String类型的数据转换为int类型的变量
	            for (int j=0; j<strings.length; j++) {
	                arrayList.add(Integer.valueOf(strings[j]));	//将String类型的转换为int类型
	            } 
	        }
	        if (arrayList.size() > 0){ 
	            Collections.sort(arrayList);                //排序
	            int miss = 0;
	            int repeat = 0;
	            int last = 0;
	            int j = 0;
	            //找重复
	            for (int i=0; i<arrayList.size(); i++) {    
	                if (i != 0) {                            //第一个数除外
	                    if (last == arrayList.get(i)) {        //找到重复的
	                        repeat = arrayList.get(i);
	                        arrayList.remove(i);            //去重
	                    }
	                }
	                
	                last = arrayList.get(i);
	                
	            }
	            for (int i=arrayList.get(0); i<arrayList.get(arrayList.size()-1); i++) {    //找丢失的
	                if (i != arrayList.get(j)){
	                    miss = i;
	                    break;
	                }
	                j++;
	            }
	            System.out.println(miss + " " + repeat);
	        } else {
	            System.out.println("0 0");
	        }
	    }
	
	}
