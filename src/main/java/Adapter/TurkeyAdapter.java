package Adapter;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quake() {
        turkey.gobble();
    }

    public static void main(String args[]){
        TurkeyAdapter adapter = new TurkeyAdapter(new WildTurkey());
        adapter.quake();
    }
}
