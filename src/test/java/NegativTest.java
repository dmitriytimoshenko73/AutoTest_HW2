import org.junit.Test;
//нет зависимости с Mockito в pom файле
import org.mockito.Mockito;
public class NegativTest {
}

    @Test
    public void testCompositeOperationWithNoChildren() {
        Component composite = new Composite("CompositeWithoutChildren");

        // Создаем мок объекта Component
        Component mockComponent = Mockito.mock(Component.class);

        // Добавляем мок объект в составной узел
        //у класса Component нет метода add
        composite.add(mockComponent);

        // Удаляем мок объект из составного узла
        //у класса Component нет метода remove
        composite.remove(mockComponent);

        // Проверяем, что метод operation() вызывается у составного узла
        composite.operation();

        // Проверяем, что метод operation() не вызывается у мок объекта, который был удален
        Mockito.verify(mockComponent, Mockito.never()).operation();
    }
}
