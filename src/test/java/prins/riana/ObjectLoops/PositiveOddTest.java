package prins.riana.ObjectLoops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositiveOddTest {
    @Test
    public void printSequence() {
        PositiveOdd objectOdd = new PositiveOdd();
        String expectedOdd = ("1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 ");
        assertEquals("Odd numbers ; ",expectedOdd, objectOdd.posOddSequence(1,32,true));

    }

}
