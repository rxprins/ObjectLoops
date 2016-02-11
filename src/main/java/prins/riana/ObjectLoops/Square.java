package prins.riana.ObjectLoops;

/**
 * Created by rianaprins on 2/9/16.
 */
public class Square {
    private String answer = "";

    public String squareSequence(int begin, int end, boolean isSquares) {
        String rAnswer = "";
        for (Integer i = begin; i <= end; i++) {
            if (isSquares) {
                int square = i * i;
               answer += square + " ";
            //    thePowerOfTen(i,end);
            //    answer = rAnswer + " ";
            }
        }
        return answer;
    }
    String thePowerOfTen(int toDo, int endNum) {
        String rAnswer = "";
        for (int j = 1; j < endNum; j++) {
            int power = (int) Math.pow(toDo,j);
             rAnswer += power + " ";
        }
        return rAnswer;
    }
}