package stategy;

public abstract class Duck {
    public FlyBehavior flyBehavior;

    public QuakeBehavior quakeBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuake(){
        quakeBehavior.quake();
    }
}
