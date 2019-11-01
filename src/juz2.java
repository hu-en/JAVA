import java.util.Scanner;

public  class juz2 {
    public static void main(String[] args) {
        int m, n, a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入矩阵行数m, 列数n");
        System.out.println("m =");
        m = s.nextInt();
        System.out.println("n =");
        n = s.nextInt();
        int h[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("你输入的第一个矩阵元素[" + i + "] [" + j + "]的值：");
                h[i][j] = s.nextInt();
            }
        }
        System.out.println("第一个矩阵如下：");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(h[i][j] + " ");
            }
            System.out.println();

            Scanner d = new Scanner(System.in);
            System.out.println("请输入矩阵行数a, 列数b");
            System.out.println("a =");
            a = s.nextInt();
            System.out.println("b =");
            b = s.nextInt();
            int z[][] = new int[a][b];
            for (int p = 0; p < a; p++) {
                for (int q = 0; q < b; q++) {
                    System.out.println("你输入的第一个矩阵元素[" + p + "] [" + q + "]的值：");
                    z[p][q] = s.nextInt();
                }
                int[][] result = r.multiply(h, z);
                if (result == null) {
                    return;
                }
                System.out.println(result);
            }
            System.out.println("第二个矩阵如下：");
            for (int g = 0; g < a; g++) {
                for (int u = 0; u < b; u++) {
                    System.out.print(z[g][u] + " ");
                }
                System.out.println();
            }
        }
    }
}

      class r {
        static int[][] multiply(int h[][], int z[][]) {
        int[][] result = null;
        int x = h[0].length;
        int y = z.length;
        if (x != y) {
            System.out.println("输入的维数不匹配，请检查");
        } else {
            int a = h.length;
            int b = z[0].length;
            result = new int[a][b];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    int sum = 0;
                    for (int k = 0; k < x; k++) {
                        sum += h[i][k] * z[k][j];

                    }
                    result[i][j] = sum;
                }
            }
        }
        return result;
        }
}
