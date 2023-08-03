package org.example.printer;

public class ModernPrinterAdapter implements Printer{
    private ModernPrinter modernPrinter;
    public ModernPrinterAdapter(ModernPrinter modernPrinter) {
        this.modernPrinter = modernPrinter;
    }

    @Override
    public void print(String message) {
        modernPrinter.printFormatted(message);
    }
}
