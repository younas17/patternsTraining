package be.abis.patterns.strategy.model;

public abstract class PacketHandler extends Node {

    public PacketHandler(String serverAddress) {
        super(serverAddress);
    }

    @Override
    public void receive(Packet packet) {
        if (packet.getDestinationAddress().equals(this.getAddress())) {
            handle(packet);
        } else {
            this.send(packet);
        }
    }

    public abstract void handle(Packet packet);
}
