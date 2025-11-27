package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MovingAverage {

    public double solution(int ar[], int k) {
        if(k==0 || ar.length==0 || k>ar.length)
            return 0;

        // if k is equal to one than return the max element
        if(k==1 ) {
            // find max and return from here
            Arrays.sort(ar);
            return ar[ar.length-1];
        }

        double max = 0;
        double runningSum = 0;
        for(int i = 0; i<k; i++) {
            runningSum += ar[i];
        }
        max = runningSum / k;

        for(int i = k, j=0;i<ar.length; i++,j++) {
            runningSum = runningSum + ar[i] -ar[j];
            if(runningSum/k > max ) {
                max = runningSum/k;
            }
        }

        return max;
    }
}
