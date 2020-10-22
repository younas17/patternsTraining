package be.abis.patterns.strategy.model;

public class InkJetPrinter implements PrintStrategy {


    String inkPrinter = "ink";

    public InkJetPrinter(String inkPrinter) {
        this.inkPrinter = inkPrinter;
    }

    @Override
    public void printerType(String content) {
        this.printerType(content);
    }
}
