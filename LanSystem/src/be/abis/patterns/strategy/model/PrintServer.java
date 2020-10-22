package be.abis.patterns.strategy.model;

public class PrintServer extends Node {
    public PrintServer(String address) {
        super(address);
    }

    public void print(Packet packet) {
        System.out.println(packet);
    }


    public void receive(Packet packet) {
        if(packet.getDestinationAdress().equals("192.186.0.202"))
        print(packet);

    }

}
