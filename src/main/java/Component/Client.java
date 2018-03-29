package Component;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        Component node1 = new Leaf("1");
        Component node2 = new Composite("2");
        Component node3 = new Leaf("3");
        root.addChild(node1);
        root.addChild(node2);
        root.addChild(node3);
        Component node21 = new Leaf("21");
        Component node22 = new Composite("22");
        node2.addChild(node21);
        node2.addChild(node22);
        Component node221 = new Leaf("221");
        node22.addChild(node221);
        root.print();
    }
}
