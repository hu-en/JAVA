public class meizi {
    public static void main(String[] args){
        int[] arr = new int[]{0,1,2,3,4,5,6};
        int [] x = { 123, 156 ,187 };
        int [] y = { 145, 154, 199, 201};
        int[] z = new int[ x.length + y.length];
        for (int i =0;i < z.length;i++){
            if (i < x.length){
                z[i] =x[i];
            }else{ z[i] =y[i - x.length]; }
        }
        for (int element : z){
            for (int m =0;m < z.length-1;m++){
                for (int n =0;n < z.length-1-m;n++){
                    if (z[n+1] <z[n]){
                     int h =z[n+1];
                     z[n+1] =z[n];
                     z[n] =h;
                    }
                }
            }
            System.out.print(" "+ element);
        }
    System.out.println("\n"+"您要找的小迷妹门牌号是"+ z[3]);
    }
}

