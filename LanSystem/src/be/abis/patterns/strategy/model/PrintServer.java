package be.abis.patterns.strategy.model;

public class PrintServer extends Node {
    private  PrintStrategy printStrategy;

    public PrintServer(String address, PrintStrategy printStrategy) {
        super(address);
        this.printStrategy=printStrategy;
    }

    @Override
    public void receive(Packet packet) {

        if(packet.getDestinationAdress().equals("192.186.0.202"))
        print(packet,printStrategy);

        else{ this.send(packet);}

    }

    private void print(Packet packet , PrintStrategy printStrategy) {
        this.printStrategy.print(packet);
    }
//    @Override
//    public void printer(String printer) {
//        this.printStrategy.printerType(printer);
//    }
}
