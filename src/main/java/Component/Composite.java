package Component;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> childs;
    public Composite(String name) {
        super(name);
        childs=new ArrayList<Component>();
    }

    public void addChild(Component component) {
        childs.add(component);
    }

    public void print(int level) {
        for(int i=0;i<level;i++){
            System.out.print("--");
        }
        System.out.println("Composite:" + name);
        for (Component component : childs) {
            component.print(level + 1);
        }
    }
}
