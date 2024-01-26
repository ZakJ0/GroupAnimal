package se.GroupAnimal;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class ToadTest {

    @Test
    void testMakeSound() {
        Toad toad = new Toad();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        toad.makeSound();
        String printedOutput = outputStream.toString().trim();

        assertEquals("Ribbit Ribbit", printedOutput);
    }

    @Test
    void testRun() {
        Toad toad = new Toad();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        toad.run();
        String printedOutput = outputStream.toString().trim();

        assertEquals("jumping fast!", printedOutput);
    }

    @Test
    void testSleep() {
        Toad toad = new Toad();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        toad.sleep();
        String printedOutput = outputStream.toString().trim();

        assertEquals("zzZZz Ribbit zzZzz", printedOutput);
        assertNotEquals("Ribbit zzZzz", printedOutput);
    }

}
