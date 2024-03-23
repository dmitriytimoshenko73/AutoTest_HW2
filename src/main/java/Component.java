import java.util.ArrayList;
import java.util.List;

// Абстрактный класс Компонент
abstract class Component {
    String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void operation();
}

// Листовой узел
class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("Leaf " + name + " is performing an operation.");
    }
}

// Составной узел
class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("Composite " + name + " is performing an operation.");
        for (Component child : children) {
            child.operation();
        }
    }
}
