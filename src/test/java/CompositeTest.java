import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTest {

    @Test
    public void testLeafOperation() {
        Component leaf = new Leaf("Leaf1");
        assertEquals("Leaf Leaf1 is performing an operation.", leaf.operation());
    }

    @Test
    public void testCompositeOperation() {
        Composite composite = new Composite("Composite1");
        composite.add(new Leaf("Leaf2"));
        composite.add(new Leaf("Leaf3"));
        assertEquals("Composite Composite1 is performing an operation.", composite.operation());
    }

}
