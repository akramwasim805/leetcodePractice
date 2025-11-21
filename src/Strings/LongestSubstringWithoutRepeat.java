package Strings;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*
LeetCode #3


String me longest substring length find karo jisme koi character repeat na ho.

Input Example:

s = "abcabcbb"
output abc

 */
public class LongestSubstringWithoutRepeat {

    public static void  solution() {
        String s = "eghaxyzdfghjaiuhk";
        StringBuilder sb = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        String maxString = "";
        for(Character cr: s.toCharArray()) {
           if(set.contains(cr)){
                while(queue.peek()!=cr){
                    Character ch = queue.poll();
                    set.remove(ch);
                }
                // end this character also from the list
                queue.poll();
                set.remove(cr);
           }
           set.add(cr);
           queue.add(cr);
           if(queue.size() > maxLength) {
               maxLength=queue.size();
               maxString=queue.toString();
           }




        }
        System.out.println("Max Length " + maxLength);
        System.out.println("Max String is " + maxString);
    }


}
