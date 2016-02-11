
package prins.riana.ObjectLoops;
import java.util.*;


public class Sequence {
    private String answer = "";

    protected String returnSequence(int begin, int end) {
        String answer = "";
        for (Integer i = begin; i <= end; i++) {
            answer += i.toString() + " ";
        }
        return answer;
    }
    public String getAnswer() {
        return answer;
    }
}