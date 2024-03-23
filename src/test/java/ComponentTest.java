import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComponentTest {

    @Test
    public void testLeafOperation() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Leaf leaf = new Leaf("Leaf1");
        leaf.operation();

        assertEquals("Leaf Leaf1 is performing an operation.\n", outContent.toString());
    }

    @Test
    public void testCompositeOperation() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Composite composite = new Composite("Composite1");
        composite.add(new Leaf("Leaf2"));
        composite.add(new Leaf("Leaf3"));
        composite.operation();

        assertEquals("Composite Composite1 is performing an operation.\n" +
                "Leaf Leaf2 is performing an operation.\n" +
                "Leaf Leaf3 is performing an operation.\n", outContent.toString());
    }
}
