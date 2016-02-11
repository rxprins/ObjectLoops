 package prins.riana.ObjectLoops;
/**
 * Created by rianaprins on 2/9/16.
 */
public class PositiveOdd {
    private String answer = "";

    protected String posOddSequence(int begin, int end, boolean isPosOdd) {
        String answer = "";
        for (Integer i = begin; i <= end; i++) {
            if (isPosOdd) {
                if (i % 2 == 1) {
                    answer += i.toString() + " ";
                }
            }
        }
        return answer;
    }
}