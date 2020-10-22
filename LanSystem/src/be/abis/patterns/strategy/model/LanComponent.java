package be.abis.patterns.strategy.model;

public abstract class LanComponent {
   private String address ;
   private LanComponent nextComponenet ;

    public LanComponent(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LanComponent getNextComponenet() {
        return nextComponenet;
    }

    public void setNextComponenet(LanComponent nextComponenet) {
        this.nextComponenet = nextComponenet;
    }

    public abstract void send(Packet packet);
    public abstract void receive(Packet packet);
}
