package arrays;

public class BinarySearch {
    public int solve(int ar[], int target) {
        if(ar.length == 0)
            return -1;
//        if(ar.length == 1)
//            return ar[0];

        int left = 0;
        int right = ar.length-1;
        int mid;
        while(left<=right) {
            mid = left + (right - left)/2;
            if(ar[mid] == target)
                return  mid;
            if(ar[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }


        return  left;



    }
}
