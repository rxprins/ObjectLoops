package prins.riana.ObjectLoops;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are we there yet?");
        String yourAnswer = input.nextLine().toLowerCase();
        if (yourAnswer.equals("yes")) {
            System.out.println("Good");
        } else {
            Sequence objNumSequence = new Sequence();
            objNumSequence.returnSequence(1, 100);

            PositiveOdd objPosOdd = new PositiveOdd();
            objPosOdd.posOddSequence(1, 100, true);

           Square objSquare = new Square();
            objSquare.squareSequence(1, 10, true);

            Random objRandom = new Random();
            objRandom.randomSequence(1, 10, true);
        }
    }
}

