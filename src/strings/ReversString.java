package strings;

public class ReversString {
    public void solve(char [] ar ) {
        int i = 0;
        int j = ar.length-1;
        while(i<j){
            char temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
    }
}
