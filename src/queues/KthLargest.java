package queues;

import java.util.PriorityQueue;

public class KthLargest {
    PriorityQueue<Integer> q;
    int k;
    public KthLargest(int [] arr, int k) {

        // by default min heaf
        q = new PriorityQueue<>(k);
        this.k = k;
        for(int ele : arr) {
            q.add(ele);
            if(q.size() > k)
                q.poll();
        }

    }

    public Integer find() {
        return q.peek();
    }

    public void add(int num) {
        q.add(num);
        if(q.size() > k)
            q.poll();
    }

    public static void main(String [] args) {
        KthLargest kthLargest = new KthLargest(new int[]{34,5,78,9,12}, 3);
        System.out.println(kthLargest.find());
        kthLargest.add(14);
        System.out.println(kthLargest.find());

    }

}
