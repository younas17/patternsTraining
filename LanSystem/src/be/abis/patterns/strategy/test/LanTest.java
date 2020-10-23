package be.abis.patterns.strategy.test;

import be.abis.patterns.strategy.model.*;
import org.junit.Before;
import org.junit.Test;

public class LanTest {
    String wsAddress;
    String destinationAddress1;
    String destinationAddress2;
    String fileServer;
    String mqServer;
    String printServer;

    @Before
    public void init() {
        wsAddress = "192.186.0.0";
        destinationAddress1 = "192.186.0.101";
        destinationAddress2 = "192.186.0.202";
        fileServer="192.186.0.001";
        printServer="192.186.0.002";
        mqServer = "192.186.0.103";
    }

    @Test
    public void testLan() {

        LanSystemFacade myFacade = new LanSystemFacade();
        myFacade.createNodes();
        WorkStation ws =myFacade.createLAN();
        String message = "Hi there";
        ws.originate(new Packet(destinationAddress1, message));
        ws.originate(new Packet(destinationAddress2, message));
        ws.originate(new Packet(fileServer, message));
        ws.originate(new Packet(mqServer, message));

    }
}
