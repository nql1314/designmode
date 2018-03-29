package template;

public abstract class CaffeineBeverage {
    void prepareRecipe(){
     boilWater();
     brew();
     pourInCup();
     addCondiments();
    }

    void boilWater(){
        System.out.println("Boil Water");
    }

    void pourInCup(){
        System.out.println("pourInCup");
    }

    abstract void brew();

    abstract void addCondiments();
}
