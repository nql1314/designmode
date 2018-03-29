package Component;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    public void addChild(Component component) {
        throw new UnsupportedOperationException();
    }

    public void print(int level) {
        for(int i=0;i<level;i++){
            System.out.print("--");
        }
        System.out.println("Leaf:" + name);
    }
}
