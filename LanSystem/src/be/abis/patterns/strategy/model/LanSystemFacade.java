package be.abis.patterns.strategy.model;

public class LanSystemFacade {
    LanComponent lanComponent;
    String wsAddress = "192.186.0.0";
    String destinationAddress1 = "192.186.0.101";
    String destinationAddress2 = "192.186.0.202";
    String fileServer = "192.186.0.001";
    String printServer = "192.186.0.002";
    String mqServer = "192.186.0.103";
    Node node1;
    Node node2;
    PrintServer ps1;
    PrintServer ps2;
    FileServer fs;
    MQServer mq;
    WorkStation ws;


    public LanSystemFacade() {

    }

    public void createNodes() {
        ws = new WorkStation(wsAddress);
        node1 = new Node("node1");

        ps1 = new PrintServer(destinationAddress1, new LazerPrinter());
        node2 = new Node("node2");

        ps2 = new PrintServer(destinationAddress2, new InkJetPrinter());

        fs = new FileServer(fileServer);
        mq = new MQServer(mqServer);
    }

    public WorkStation createLAN() {
        ws.setNextComponent(node1);
        node1.setNextComponent(ps1);
        ps1.setNextComponent(mq);
        mq.setNextComponent(node2);
        node2.setNextComponent(ps2);
        ps2.setNextComponent(fs);
        fs.setNextComponent(ws);
        return ws;
    }

}
