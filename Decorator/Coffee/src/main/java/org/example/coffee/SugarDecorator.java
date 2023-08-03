package org.example.coffee;

// ConcreteDecorator - Thêm đường vào cà phê
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", thêm đường";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}

