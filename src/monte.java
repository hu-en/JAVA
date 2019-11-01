import java.util.Scanner;

public class monte {
    public static void main(String[] args) {
        double x, y;
        long n =0;
        System.out.println("请输入循环精度： " );
        Scanner c = new Scanner(System .in);
        long count = c.nextInt();
        for (int i = 0; i <= count; i++) {
            x = Math.random() * (1.0 - 0) + 0;
            y = Math.random() * (1.0 - 0) + 0;
            if (x*x + y*y <= 1.0) {
                n++;
            }
        }
        double PI = 4 * (double)n/(double)count;
        System.out.println("π约为"+ PI);
    }
}
