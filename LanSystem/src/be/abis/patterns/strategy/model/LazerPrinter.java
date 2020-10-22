package be.abis.patterns.strategy.model;

public class LazerPrinter implements PrintStrategy {
 String lazer ="lazer" ;

    public LazerPrinter(String lazer) {
        this.lazer = lazer;
    }

    @Override
    public void printerType(String printerType) {
        this.printerType(printerType);

    }
}
