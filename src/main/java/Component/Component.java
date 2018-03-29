package Component;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    abstract public void addChild(Component component);

    public void print(){
        print(0);
    }
    abstract public void print(int level);
}
