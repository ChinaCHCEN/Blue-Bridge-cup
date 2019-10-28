package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_��ӡʮ��ͼ {
    
    public static void getResult(int n) {
        int len = 5 + 4 * n;
        int mid = len / 2;
        char[][] result = new char[len][len];
        for(int i = 0;i < len;i++)
            for(int j = 0;j < len;j++)
                result[i][j] = '.';
        for(int i = mid - 2;i <= mid + 2;i++) {
            result[mid][i] = '$';
            result[i][mid] = '$';
        }
        for(int i = 1;i <= n;i++) {
            for(int j = mid - 2 * i;j <= mid + 2 * i;j++) {
                result[mid - 2 * (i + 1)][j] = '$';
                result[mid + 2 * (i + 1)][j] = '$';
                result[j][mid - 2 * (i + 1)] = '$';
                result[j][mid + 2 * (i + 1)] = '$';
            }
            //���Ͻ�
            result[mid - 2 * i][mid - 2 * i] = '$';
            result[mid - 2 * i][mid - 2 * i - 1] = '$';
            result[mid - 2 * i - 1][mid - 2 * i] = '$';
            //���Ͻ�
            result[mid - 2 * i][mid + 2 * i] = '$';
            result[mid - 2 * i - 1][mid + 2 * i] = '$';
            result[mid - 2 * i][mid + 2 * i + 1] = '$';
            //���½�
            result[mid + 2 * i][mid - 2 * i] = '$';
            result[mid + 2 * i][mid - 2 * i - 1] = '$';
            result[mid + 2 * i + 1][mid - 2 * i] = '$';
            //���½�
            result[mid + 2 * i][mid + 2 * i] = '$';
            result[mid + 2 * i][mid + 2 * i + 1] = '$';
            result[mid + 2 * i + 1][mid + 2 * i] = '$';
        }
        for(int i = 0;i < len;i++) {
            for(int j = 0;j < len;j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        getResult(n);
    }
}