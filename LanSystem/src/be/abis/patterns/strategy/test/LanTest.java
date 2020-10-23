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

        WorkStation ws = new WorkStation(wsAddress);
        Node node1 = new Node("node1");

        PrintServer ps1 = new PrintServer(destinationAddress1, new LazerPrinter());
        Node node2 = new Node("node2");

        PrintServer ps2 = new PrintServer(destinationAddress2, new InkJetPrinter());

        FileServer fs = new FileServer(fileServer);
        MQServer mq = new MQServer(mqServer);

        ws.setNextComponent(node1);
        node1.setNextComponent(ps1);
        ps1.setNextComponent(mq);
        mq.setNextComponent(node2);
        node2.setNextComponent(ps2);
        ps2.setNextComponent(fs);
        fs.setNextComponent(ws);


        String message = "Hi there";
        ws.originate(new Packet(destinationAddress1, message));
        ws.originate(new Packet(destinationAddress2, message));
        ws.originate(new Packet(fileServer, message));
        ws.originate(new Packet(mqServer, message));

    }
}
