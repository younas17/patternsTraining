package be.abis.patterns.strategy.model;

public class Packet {
    private String destinationAddress;
    private String contents;

    public Packet(String destinationAdress, String contents) {
        this.destinationAddress = destinationAdress;
        this.contents = contents;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }


    @Override
    public String toString() {
        return "Packet arrived at"+this.getClass().getSimpleName() +
                " from='" + destinationAddress + '\'' +
                " with contents='" + contents + '\''
                ;
    }
}
