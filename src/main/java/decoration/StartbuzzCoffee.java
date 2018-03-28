package decoration;

public class StartbuzzCoffee {
    public static void main(String args[]){
        Beverage beverage = new HouseBlend();
        beverage = new Moca(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());
    }
}
