package be.abis.patterns.strategy.model;

public class Node extends LanComponent{
    public Node(String address) {
        super(address);
    }

    @Override
    public void send(Packet packet) {
    this.getNextComponenet().send(packet);
    }

    @Override
    public void receive(Packet packet) {
    this.getNextComponenet().receive(packet);
    }
}
