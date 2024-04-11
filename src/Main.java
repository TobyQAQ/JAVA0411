import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        //宣告矩陣,列印一維矩陣
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a.length);
        System.out.println(a[1]);

        //建立新的一維矩陣
        int[] b = new int[6];
        b[0] = 7;
        b[1] = 6;
        b[2] = 5;

        //建立二維矩陣，並對各位置輸入值
        int[][] c = {{1, 1}, {2, 2}, {3, 3}};
        System.out.print(c[2][1]);
        int[][] d = new int[3][2];
        d[1][0] = 3;
        d[1][1] = 3;
        d[2][0] = 4;
        d[2][1] = 4;
        d[0][0] = 7;
        d[0][1] = 7;
        System.out.println(d[2][0]);

        //用迴圈列印矩陣全部的值
        int[] e = new int[10];
        for (int i = 0; i <= 9; i++) {
            e[i] = i + 1;
            System.out.println(e[i]);
        }

        int[] f = new int[10];
        for (int i = 0; i < f.length; i++) {
            f[i] = i + 1;
            System.out.println(f[i]);
        }

        //使用隨機
        Random h = new Random();
        System.out.println(h.nextInt(101));
        int[] g = new int[5];
        for (int i = 0; i < g.length; i++) {
            g[i] = h.nextInt(10);
            System.out.println(g[i]);
        }


        //新增搜尋是否有SEARCH一樣的數字以及次數
        int search = 3;
        int found = 0;
        for (int i = 0; i < g.length; i++) {
            if (g[i] == search) {
                found++;
            }
        }
        System.out.println(found);

        char[] k = "apple".toCharArray();
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }

        //CHAR位置交換
        //char temp = k[0];
        //k[0] = k[4];
        //k[4] = temp;

        int left = 0;
        int right = k.length - 1;

        //整個字符全部交換
        while (right > left) {
            char temp = k[left];
            k[left] = k[right];
            k[right] = temp;
            left++;
            right--;
        }

        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }




        



    }
}