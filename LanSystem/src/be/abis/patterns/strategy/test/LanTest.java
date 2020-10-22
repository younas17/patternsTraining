package be.abis.patterns.strategy.test;

import be.abis.patterns.strategy.model.*;
import org.junit.Test;

public class LanTest {

    @Test
    public void testLan() {
        WorkStation ws = new WorkStation("192.186.0.0");
        Node node1 = new Node("abc");
        PrintServer ps1 = new PrintServer("192.186.0.101",new LazerPrinter());
        Node node2 = new Node("efg");
        PrintServer ps2 = new PrintServer("192.186.0.202",new InkJetPrinter());
        ws.setNextComponent(node1);
        node1.setNextComponent(ps1);
        ps1.setNextComponent(node2);
        node2.setNextComponent(ps2);
        ps2.setNextComponent(ws);

        Packet myPacket = new Packet("192.186.0.202", "Hi there , " );
        ws.originate(myPacket);

    }
}
