package AbstractFactory;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
}
