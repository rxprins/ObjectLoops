import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectLoopsTest {
    @Test
    public void printSequenceTest()  {
        ObjectLoops objectSeq = new ObjectLoops();
        String expectedSeq = ("10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 ");
        assertEquals("Numbers in sequence ; ",expectedSeq, objectSeq.printSequence(10,26,false,false,false));

        ObjectLoops objectOdd = new ObjectLoops();
        String expectedOdd = ("1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 ");
        assertEquals("Odd numbers ; ",expectedOdd, objectOdd.printSequence(1,32,true,false,false));

        ObjectLoops objectSquare = new ObjectLoops();
        String expectedSquare = ("1 4 9 16 25 36 49 64 81 100 ");
        assertEquals("Square of numbers ; ",expectedSquare, objectSquare.printSequence(1,10,false,true,false));

        ObjectLoops objectRandom = new ObjectLoops();
        String expectedRandom = (" ");
        assertEquals("Random numbers ; ",expectedRandom, objectRandom.printSequence(1,10,false,false,true));
    }
}