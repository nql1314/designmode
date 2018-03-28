package stategy;

public class MallarDuck extends Duck {
    public MallarDuck(){
        flyBehavior = new FlyWithWings();
        quakeBehavior = new Quake();
    }
}
