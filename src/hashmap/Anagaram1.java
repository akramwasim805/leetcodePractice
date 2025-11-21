package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
LeetCode #242

❗Your Task

Given two strings s and t, check whether t is an anagram of s.
(Anagram ka matlab: same characters, same frequency)

Input Example:

s = "anagram", t = "nagaram"
 */
public class Anagaram1 {

    public static void solution() {
        String s = "anagrate";
        String t = "nagaram";
        Set<Character> set = new HashSet<Character>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()) {
            set.add(c);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Character c: t.toCharArray()) {
            set.add(c);
            map.put(c, map.getOrDefault(c, 0)-1);
        }

        for(Character c: set.stream().toList()) {
            // check in hasmap count shoule be zero
            if(map.get(c) != 0) {
                System.out.println("Not anagram");
                return;
            }


        }

        System.out.println("Congo these are Anagram");

    }
}
