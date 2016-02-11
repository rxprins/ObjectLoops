package prins.riana.ObjectLoops;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rianaprins on 2/9/16.
 */
public class SequenceTest {
    @Test
    public void printSequenceTest() {
        Sequence objectSeq = new Sequence();
        String expectedSeq = ("10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 ");
        assertEquals("Numbers in sequence ; ", expectedSeq, objectSeq.returnSequence(10, 26));

    }
}