package decoration;

public class Moca extends CondimentDecorator {
    public Moca(Beverage beverage){
        this.beverage = beverage;
    }
    public double cost() {
        return 1+beverage.cost();
    }
}
