package org.example;

import org.example.coffee.Coffee;
import org.example.coffee.MilkDecorator;
import org.example.coffee.SimpleCoffee;
import org.example.coffee.SugarDecorator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Tạo một cà phê gốc
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cà phê gốc: " + coffee.getDescription() + ", Giá: $" + coffee.cost());

        // Thêm đường vào cà phê
        Coffee coffeeWithSugar = new SugarDecorator(coffee);
        System.out.println("Cà phê với đường: " + coffeeWithSugar.getDescription() + ", Giá: $" + coffeeWithSugar.cost());

        // Thêm sữa vào cà phê
        Coffee coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println("Cà phê với sữa: " + coffeeWithMilk.getDescription() + ", Giá: $" + coffeeWithMilk.cost());

        // Thêm cả đường và sữa vào cà phê
        Coffee coffeeWithSugarAndMilk = new SugarDecorator(new MilkDecorator(coffee));
        System.out.println("Cà phê với đường và sữa: " + coffeeWithSugarAndMilk.getDescription() + ", Giá: $" + coffeeWithSugarAndMilk.cost());
    }
}
