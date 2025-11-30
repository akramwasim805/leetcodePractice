package queues;

import java.util.*;

public class KMostFrequent {
    //nums = [1,1,1,2,2,,3], k = 2
    Map<Integer, Integer> map;
    ArrayList<Integer> result = new ArrayList<>();
    KMostFrequent() {
        map = new HashMap<>();
    }

    List<Integer> find(Integer [] ar, int k) {
        for(int elm: ar) {
            map.put(elm, map.getOrDefault(elm, 0)+1);
        }

        Integer ar2[] = new Integer[map.keySet().size()];
        int i =0;
        for(Integer el : map.keySet()) {
           ar2[i++] = el;
        }
        // now sort the array based on value
        Arrays.sort(ar2,(a, b)->(map.get(a)-map.get(b)));


        // now take last k element

        for(int j=0; j<k; j++) {
            result.add(ar2[ar2.length-1-j]);
        }
        return result;
    }


    public static void main(String args []) {
        KMostFrequent kMostFrequent = new KMostFrequent();
        List<Integer> list = kMostFrequent.find(new Integer[] {1,1,1,2,2,3}, 2);
        list.forEach(x->System.out.println(x));

    }


}
