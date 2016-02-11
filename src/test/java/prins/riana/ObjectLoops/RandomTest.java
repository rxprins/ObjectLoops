package prins.riana.ObjectLoops;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomTest {
    @Test
    public void printSequenceSpec() {
        Random objectRandom = new Random();
        String expectedRandom = (" ");
        assertEquals("Random numbers ; ",expectedRandom, objectRandom.randomSequence(1,10,true));

        String actual = objectRandom.randomSequence(10,10,true);
        int expected = Integer.parseInt(actual);
        assertTrue(0 < expected && expected < 11);
    }
}
