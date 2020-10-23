package be.abis.patterns.strategy.model;

public class PrintServer extends Node {
    private final PrintStrategy printStrategy;

    public PrintServer(String address, PrintStrategy printStrategy) {
        super(address);
        this.printStrategy=printStrategy;
    }

    @Override
    public void receive(Packet packet) {

        if(packet.getDestinationAddress().equals(packet.getDestinationAddress()))
        print(packet);

        else{ this.send(packet);}

    }

    private void print(Packet packet ) {
        this.printStrategy.print(packet);
    }
}
