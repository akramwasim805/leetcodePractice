package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MergeIntervals {
    public List<int []>  solve (int [][] intervals ) {

        // first sort the arrays based on first element
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);


        Arrays.stream(intervals).forEach(x->System.out.println(x[0]));

        //
        List<int[]> result = new ArrayList<>();
//        int i = 0;
//        int temp [] = new int[2];
//        temp[0] = intervals[0][0];
//        temp[1] = intervals[0][1];
//
//        for(int j = 1; j< intervals.length; j++) {
//            while( j< intervals.length && temp[1] >= intervals[j][0]) {
//                temp[1] = Math.max(temp[1],intervals[j][1]);
//                j++;
//            }
//
//            if (j>=intervals.length)  {
//                break;
//            }
//            result.add(temp);
//            temp = new int[2];
//            temp[0] = intervals[j][0];
//            temp[1] = intervals[j][1];
//        }

        int [] current = intervals[0];

        for(int i = 1; i< intervals.length; i++) {
            int [] next = intervals[i];
            if(current[1] > next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                result.add(current);
            }

            current = next;
        }

        // last me push current

        result.add(current);





        return  result;
    }


    public int getMeetingRooms(int [][] intervals) {

        // sort intervals in starting and ending time



        // 3, 4, 5, 11, 13
        // 10, 12, 14, 15, 16
        int start[] = new int[intervals.length];
        int end[] = new int[intervals.length];

        for(int i = 0; i< intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);
        int count = 0;
        int maxCount = 0;

        for(int i = 0, j=0; i<intervals.length && j<intervals.length; ) {
            if(start[i] < end[j]) {
                i++;
                count++;
                if(count > maxCount) {
                    maxCount = count;
                }
            } else {
                j++;
                count = 0;

            }
        }
        return count;
    }

    public static void main(String [] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        List<int [] > list = mergeIntervals.solve(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        list.stream().forEach(x->System.out.println(x[0] + "=====" + x[1]));
    }
}
