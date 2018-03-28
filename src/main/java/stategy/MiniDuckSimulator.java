package stategy;

/**
 * 策略模式
 */
public class MiniDuckSimulator {
    public static void main(String args[]){
        Duck mallarDuck = new MallarDuck();
        mallarDuck.performFly();
        mallarDuck.performQuake();
        mallarDuck.flyBehavior = new FlyNoWay();
        mallarDuck.performFly();
    }
}
