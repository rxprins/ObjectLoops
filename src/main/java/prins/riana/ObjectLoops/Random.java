package prins.riana.ObjectLoops;

/**
 * Created by rianaprins on 2/9/16.
 */
public class Random {
    private String answer = "";

     protected String randomSequence(int begin, int end, boolean isRandom) {
        String answer = "";
        for (Integer i = begin; i <= end; i++) {
            if (isRandom) {
                int randomNum = begin + (int) (Math.random() * end);
                answer += randomNum + " ";
            }
        }
        return answer;
    }
}

