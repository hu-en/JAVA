
public class num { //这个算法是计算1+2+...+100的和
    public static void main(String[] args) { //这两行你不用管它，这是码农的地盘
        int n = 0; //输入一个数
        int sum = 0; //和
        for (int i = 0; i <= 100; i++) { //循环次数为i
            sum = sum + n; //相当于1+2+3+...+100
            n++; //相当于1,2,3,4，...，100
        }
        System.out.println("1到100的和为" + sum);
    }
}

