package org.example.coffee;

// ConcreteComponent - Lớp cà phê gốc
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Cà phê đơn giản";
    }

    @Override
    public double cost() {
        return 1.0;
    }

}
