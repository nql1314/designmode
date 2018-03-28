package FactoryMethod;

public class NYPizzaStore implements PizzaStore {

    public Pizza orderPizza(String item) {
        Pizza pizza = null;
        if(item.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else if(item.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }else{
            throw new UnsupportedOperationException();
        }
        pizza.make();
        return pizza;
    }
}
