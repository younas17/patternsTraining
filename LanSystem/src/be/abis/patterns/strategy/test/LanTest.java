package be.abis.patterns.strategy.test;

import be.abis.patterns.strategy.model.Node;
import be.abis.patterns.strategy.model.Packet;
import be.abis.patterns.strategy.model.PrintServer;
import be.abis.patterns.strategy.model.WorkStation;
import org.junit.Test;

public class LanTest {

    @Test
    public void testLan() {
        WorkStation ws = new WorkStation("192.186.0.0");
        Node node1 = new Node("abc");
        PrintServer ps1 = new PrintServer("192.186.0.101");
        Node node2 = new Node("efg");
        PrintServer ps2 = new PrintServer("192.186.0.202");
        ws.setNextComponenet(node1);
        node1.setNextComponenet(ps1);
        ps1.setNextComponenet(node2);
        node2.setNextComponenet(ps2);
        ps2.setNextComponenet(ws);

        Packet myPacket = new Packet("Hi there", "192.186.0.202");
        ws.originate(myPacket);

    }
}
