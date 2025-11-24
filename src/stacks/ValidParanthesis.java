package stacks;
/*
Check if given string has valid paranthesis or not

Input: "()[]{}" → valid
Input: "(]" → not valid
Input: "([{}])" → valid




 */

import java.util.Stack;

public class ValidParanthesis {
    public boolean validate(String str) {
        Stack<Character> mystack = new Stack<>();
        for(Character ch: str.toCharArray()) {
            switch (ch) {
                case '(', '[', '{' -> {
                    mystack.push(ch);}
                case ')' -> {
                    if(mystack.isEmpty() || mystack.peek() != '(')
                        return false;
                    mystack.pop();
                }
                case ']' -> {
                    if(mystack.isEmpty() || mystack.peek() != '[')
                        return false;
                    mystack.pop();
                }
                case '}' -> {
                    if(mystack.isEmpty() || mystack.peek() != '{')
                        return false;
                    mystack.pop();
                }
            }
        }

        if(!mystack.isEmpty())
            return false;

        return true;
    }
}
