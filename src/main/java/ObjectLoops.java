import java.util.Scanner;

/**
 * Created by rianaprins on 2/9/16.
 */
public class ObjectLoops {
    private String myAnswer = "";

    public String printSequence(int begin, int end, boolean isPosOdd, boolean isSquares, boolean isRandom) {
        String answer = "";
        for (Integer i = begin; i <= end; i++) {
            if (!isPosOdd && !isSquares && !isRandom) {
                answer += i.toString() + " ";
            }
            if (isPosOdd) {
                if (i % 2 == 1) {
                    answer += i.toString() + " ";
                }
            } else if (isSquares) {
                int square = i * i;
                answer += square + " ";
            } else if (isRandom) {
                int randomNum = begin + (int) (Math.random() * end);
                answer += randomNum + " ";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are we there yet?");
        String yourAnswer = input.nextLine().toLowerCase();
        if (yourAnswer .equals("yes")) {
            System.out.println("Good");
        } else {
            ObjectLoops objNumSequence = new ObjectLoops();
            objNumSequence.printSequence(1, 100, false, false, false);

            ObjectLoops objPosOdd = new ObjectLoops();
            objPosOdd.printSequence(1, 100, true, false, false);

            ObjectLoops objSquare = new ObjectLoops();
            objSquare.printSequence(1, 10, false, true, false);

            ObjectLoops objRandom = new ObjectLoops();
            objRandom.printSequence(1, 10, false, false, true);
        }
    }
}