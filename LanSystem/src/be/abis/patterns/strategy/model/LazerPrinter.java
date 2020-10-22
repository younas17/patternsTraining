package be.abis.patterns.strategy.model;

public class LazerPrinter implements PrintStrategy {

    @Override
        public void print(Packet packet) {
            System.out.println(" message :" + packet.getContents() + " it arrived at " + packet.getDestinationAdress() + "  and will printed by a " + this.getClass().getSimpleName());

    }
}
