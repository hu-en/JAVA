import java.util.Scanner;

    class Matrix<A> {
        public int[][] creat() {
            Scanner input = new Scanner(System.in);
            System.out.print("请输入矩阵的阶数： ");
            int m = input.nextInt();
            int n = input.nextInt();
            int A[][] = new int[m][n];
            System.out.print("请输入矩阵的值（0——9）：");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("你输入的第一个矩阵元素A[" + i + "] [" + j + "]的值");
                    A[i][j] = input.nextInt();
                }
            }
            return A;
        }

    public int[][] multiply(int A[][] , int B[][] ) {
        int[][] result = null;
        int x = A[0].length;
        int y = B.length;
        if (x != y) {
            System.out.println("输入的维数不匹配，请检查");
        } else {
            int a = A.length;
            int b = B[0].length;
            result = new int[a][b];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    int sum = 0;
                    for (int k = 0; k < x; k++) {
                        sum += A[i][k] * B[k][j];
                    }
                    result[i][j] = sum;
                }
            }
        }
        return result;
    }

public void print(int[][]A) {
    System.out.println("矩阵为:");
    for (int i = 0; i < A.length; i++) {
        for (int j = 0; j < A[i].length; j++) {
            System.out.println( A[i][j] + "");
        }
        System.out.println();
    }
    }

    public static class juz {
        public static void main(String[] args) {
            Matrix r =new Matrix();
            int A[][] = r.creat();
            System.out.println("第一个矩阵为:"+A);
            Matrix t =new Matrix();
            int B[][] = t.creat();
           System.out.println("第二个矩阵为:"+B);
           int[][] result = r.multiply(A,B);
           if (result == null) {
               return;
           }
           r.print(result);
        }
    }
}