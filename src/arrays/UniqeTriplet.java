package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqeTriplet {
    public List<List<Integer>> solve(int [] nums) {

        //first sort the array
        Arrays.sort(nums);

        // now take two pointer
        List<List<Integer>> results = new ArrayList<>();

        //i ko fix krke baki dono par two pointer lena he or dekhna he ki sum zero he

        for(int i = 0; i<nums.length-2;i++) {

            // yha par duplicate handle krlo, jab tak ith value i-1 ke barabara he skip krte jao
            //because we have already take it before

            if(i>0 && nums[i-1]==nums[i])
                continue;


            // jo i fix kiya he uske bad
            int left = i+1;

            // last wala
            int right = nums.length-1;

            while(left<right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    results.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;
                    left++;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    while (left < right && nums[right] == nums[right + 1])
                        right--;

                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return results;
    }
}
