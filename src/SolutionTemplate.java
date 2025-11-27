import arrays.MovingAverage;
import arrays.UniqeTriplet;
import stacks.ValidParanthesis;
import strings.LongestSubstringWithoutRepeat;
import arrays.SellStock;
import arrays.TwoSumProblem;
import hashmap.Anagaram1;
import strings.ReversString;

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

        ReversString rStr = new ReversString();
        char str [] = new char[] {'w', 'a','k','m','o'};
        rStr.solve(str);
        System.out.println(str);


        // triplets

        UniqeTriplet obj = new UniqeTriplet();
        int[] ar = {-1,0,1,2,-1,-4};

        System.out.println(obj.solve(ar));

        MovingAverage movingAverage = new MovingAverage();
        System.out.println(movingAverage.solution(new int[] {1,12,-5,-6,50,3}, 4));


    }
}
