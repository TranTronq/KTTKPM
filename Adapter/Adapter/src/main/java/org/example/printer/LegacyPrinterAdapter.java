package org.example.printer;

public class LegacyPrinterAdapter implements Printer{
    private LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String message) {
        legacyPrinter.print(message);
    }
}
