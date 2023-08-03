package org.example;

import org.example.subsystem.Facade;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Facade facade = new Facade();
        facade.doComplexOperation();
    }
}
