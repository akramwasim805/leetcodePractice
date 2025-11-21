package arrays;


import java.util.HashMap;

/*
Problem : Find 2 element in an array that are equal to a sum

brute force is o(n2)
use hashmap for o(n) solution


 */
public class TwoSumProblem {
    public static  void run() {
        Integer ar [] = new Integer[]{10, 13, 16, 2, 15,3};
       solution(ar, 17);
    }

    public static void solution(Integer[] ar, int sum ) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int elem: ar) {
            if( map.get(sum - elem) != null) {
                System.out.println("Found two variable with sum first is {elem} and second is {sum-elem}");

            } else {
                map.put(elem, 1);
            }
        }

        System.out.println("Not found");

    }
}
