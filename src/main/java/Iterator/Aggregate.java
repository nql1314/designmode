package Iterator;

import java.util.Iterator;

public class Aggregate implements Iterable<Integer>{
    private int[] items;

    public Aggregate(){
        items = new int[10];
        for(int i=0;i<10;i++){
            items[i] = i;
        }
    }
    public Iterator<Integer> iterator(){
        return new ConcreteIterator(items);
    }
}
