package FactoryMethod;

public class ChicagoPizzaStore implements PizzaStore {

    public Pizza orderPizza(String item) {
        Pizza pizza = null;
        if(item.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }else if(item.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }else{
            throw new UnsupportedOperationException();
        }
        pizza.make();
        return pizza;
    }
}
