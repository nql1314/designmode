package SimpleFactory;

public class PizzaStore {
    public static void main(String args[]){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza pizza = factory.createPizza("greek");
        pizza.make();
    }
}
