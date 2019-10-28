package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_´òÓ¡Ê®×ÖÍ¼ {
    
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
            //×óÉÏ½Ç
            result[mid - 2 * i][mid - 2 * i] = '$';
            result[mid - 2 * i][mid - 2 * i - 1] = '$';
            result[mid - 2 * i - 1][mid - 2 * i] = '$';
            //ÓÒÉÏ½Ç
            result[mid - 2 * i][mid + 2 * i] = '$';
            result[mid - 2 * i - 1][mid + 2 * i] = '$';
            result[mid - 2 * i][mid + 2 * i + 1] = '$';
            //×óÏÂ½Ç
            result[mid + 2 * i][mid - 2 * i] = '$';
            result[mid + 2 * i][mid - 2 * i - 1] = '$';
            result[mid + 2 * i + 1][mid - 2 * i] = '$';
            //ÓÒÏÂ½Ç
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