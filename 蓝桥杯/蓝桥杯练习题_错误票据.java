package ���ű�����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ���ű���ϰ��_����Ʊ�� {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		  int n = input.nextInt();
	        ArrayList<Integer> arrayList = new ArrayList<Integer>();
	        String string = new String();
	        input.nextLine();
	        for (int i=0; i<n; i++) {
	            string = input.nextLine();
	            string = string.trim();	//ȥ�����οո�
//	            String[] strings = string.split(" ");
	            String[] strings = string.split("\\s+");    //ȥ���ո�
	            //��String���͵�����ת��Ϊint���͵ı���
	            for (int j=0; j<strings.length; j++) {
	                arrayList.add(Integer.valueOf(strings[j]));	//��String���͵�ת��Ϊint����
	            } 
	        }
	        if (arrayList.size() > 0){ 
	            Collections.sort(arrayList);                //����
	            int miss = 0;
	            int repeat = 0;
	            int last = 0;
	            int j = 0;
	            //���ظ�
	            for (int i=0; i<arrayList.size(); i++) {    
	                if (i != 0) {                            //��һ��������
	                    if (last == arrayList.get(i)) {        //�ҵ��ظ���
	                        repeat = arrayList.get(i);
	                        arrayList.remove(i);            //ȥ��
	                    }
	                }
	                
	                last = arrayList.get(i);
	                
	            }
	            for (int i=arrayList.get(0); i<arrayList.get(arrayList.size()-1); i++) {    //�Ҷ�ʧ��
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
