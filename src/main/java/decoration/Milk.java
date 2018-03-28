package decoration;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    public double cost() {
        return 1+beverage.cost();
    }
}
