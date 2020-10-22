package be.abis.patterns.strategy.model;

public class Node extends LanComponent{
    public Node(String address) {
        super(address);
    }

    @Override
    public void send(Packet packet) {
    this.getNextComponent().receive(packet);
    }

    @Override
    public void receive(Packet packet) {
    this.getNextComponent().send(packet);
    }
}
