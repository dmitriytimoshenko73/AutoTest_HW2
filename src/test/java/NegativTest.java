import org.junit.Test;
import org.mockito.Mockito;
public class NegativTest {
}

    @Test
    public void testCompositeOperationWithNoChildren() {
        Component composite = new Composite("CompositeWithoutChildren");

        // Создаем мок объекта Component
        Component mockComponent = Mockito.mock(Component.class);

        // Добавляем мок объект в составной узел
        composite.add(mockComponent);

        // Удаляем мок объект из составного узла
        composite.remove(mockComponent);

        // Проверяем, что метод operation() вызывается у составного узла
        composite.operation();

        // Проверяем, что метод operation() не вызывается у мок объекта, который был удален
        Mockito.verify(mockComponent, Mockito.never()).operation();
    }
}