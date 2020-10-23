package be.abis.patterns.strategy.model;

public class FileServer extends PacketHandler {

    public FileServer(String address) {
        super(address);
    }

    @Override
    public void handle(Packet packet) {
        System.out.println("message will be saved in " + this.getClass().getSimpleName() );
    }

}
