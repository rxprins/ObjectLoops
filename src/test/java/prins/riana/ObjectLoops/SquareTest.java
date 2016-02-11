package prins.riana.ObjectLoops;
import org.junit.Test;
import static org.junit.Assert.*;


public class SquareTest {
    @Test
    public void printSequenceSpec() {
        Square objectSquare = new Square();
        String expectedSquare = ("1 4 9 16 25 36 49 64 81 100 ");
        assertEquals("Square of numbers ; ",expectedSquare, objectSquare.squareSequence(1,10,true));

    }
}
