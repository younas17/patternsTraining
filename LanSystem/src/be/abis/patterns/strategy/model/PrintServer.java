package be.abis.patterns.strategy.model;

public class PrintServer extends Node implements Printer {
    private  PrintStrategy printStrategy;
    public PrintServer(String address) {
        super(address);
    }

    public void print(Packet packet) {
        System.out.println(packet);
    }

    @Override
    public void receive(Packet packet) {
        if(packet.getDestinationAdress().equals("192.186.0.202"))
        print(packet);

        else System.out.println("you are at the wrong destination ");

    }

    @Override
    public void print(String printer) {
        this.printStrategy.printerType(printer);
    }
}
