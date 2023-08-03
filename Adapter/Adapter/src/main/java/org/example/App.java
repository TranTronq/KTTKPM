package org.example;

import org.example.printer.*;

public class App 
{
    public static void main( String[] args )
    {
        Printer printer1 = new LegacyPrinterAdapter(new LegacyPrinter());
        Printer printer2 = new ModernPrinterAdapter(new ModernPrinter());


        printer1.print("Hello from Legacy Printer");
        printer2.print("Hello from Modern Printer");
    }
}
