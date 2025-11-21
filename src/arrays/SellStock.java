package arrays;

public class SellStock {
    public static void run() {
        int [] ar = new int[]{12,30,11,23,40,1,34};
        int min = ar[0];
        int max = 0;
        for(int i =1; i<ar.length; i++) {
            if((ar[i] - min) > max ) {
                max = ar[i] - min;
            }

            if( ar[i] < min ) {
                min = ar[i];
            }


        }

        System.out.println(max);
    }
}
