package be.abis.patterns.strategy.model;

public class MQServer extends PacketHandler {
    public MQServer(String serverAddress) {
        super(serverAddress);
    }

    @Override
    public void handle(Packet packet) {
        System.out.println(packet.toString() );

    }
}
