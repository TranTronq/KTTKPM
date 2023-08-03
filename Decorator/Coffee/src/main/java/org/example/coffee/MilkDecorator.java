package org.example.coffee;

// ConcreteDecorator - Thêm sữa vào cà phê
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", thêm sữa";
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }
}
