import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a.length);
        System.out.println(a[1]);

        int[] b = new int[6];
        b[0] = 7;
        b[1] = 6;
        b[2] = 5;

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

        Random h = new Random();
        System.out.println(h.nextInt(101));
        int[] g = new int[5];
        for (int i = 0; i < g.length; i++) {
            g[i] = h.nextInt(10);
            System.out.println(g[i]);
        }


        int search = 3;
        int found = 0;
        for (int i = 0; i < g.length; i++) {
            if (g[i] == search) {
                found ++;
            }
        }
        System.out.println(found);
    }
}