import stacks.ValidParanthesis;
import strings.LongestSubstringWithoutRepeat;
import arrays.SellStock;
import arrays.TwoSumProblem;
import hashmap.Anagaram1;

public class SolutionTemplate {

    public static void main(String[] args) {
        int[] arr = { };
        System.out.println();
        TwoSumProblem.run();
        SellStock.run();
        Anagaram1.solution();
        LongestSubstringWithoutRepeat.solution();

        // Paranthesis
        ValidParanthesis validParanthesis = new ValidParanthesis();
        if (validParanthesis.validate(")[]{}"))
            System.out.println("valid");
        else
            System.out.println("Invalid");

    }
}
