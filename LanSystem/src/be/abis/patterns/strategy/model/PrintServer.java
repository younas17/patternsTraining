package be.abis.patterns.strategy.model;

public class PrintServer extends PacketHandler {
    private final PrintStrategy printStrategy;

    public PrintServer(String serverAddress, PrintStrategy printStrategy) {
        super(serverAddress);
        this.printStrategy = printStrategy;
    }

    public void handle(Packet packet) {
        this.printStrategy.print(packet);
    }
}
