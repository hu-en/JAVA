import java.util.Scanner;

public class test  {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out .println("请输入a= ");
        double a = A.nextInt();
        Scanner K = new Scanner(System.in);
        System.out .println("请输入k= ");
        double k = K.nextInt();
        Scanner B = new Scanner(System.in);
        System.out .println("请输入b= ");
        double b = B.nextInt();
        double x = -100 ;
        double e = (float)-1 / 216 * x + (float) 1 / 72 * (x - 1/a) + (float) 1 / 36 * (x - 2/a) +
                (float)5/108 * (x - 3/a) + (float) 5 / 36 * (x - 4/a) +(float) 1 / 8 * (x - 6/a) +
                (float) 1 / 9 * (x -6/a) + (float) 1 / 8 * ( x - 7/a);
        double c = k *x + b;
        double E = e * (-c) + 10 * c;
        double num = E;
        if (num > E) {
            for (x = -100; x < 100; ++x) {
                int n = (int) x;
                break;
            }
            System.out.println();
        }
    }
}
