public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a.length);

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

    }
}