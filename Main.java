public class Main {
    public static void main(String[] args) {
        
        QueueManager queueManager = QueueManager.getInstance();

        
        HelpDeskStation station1 = new HelpDeskStation("Station 1");
        HelpDeskStation station2 = new HelpDeskStation("Station 2");
        HelpDeskStation station3 = new HelpDeskStation("Station 3");

        
        OnlineMonitor onlineMonitor = new OnlineMonitor();

       
        station1.serveNextCustomer();
        station2.serveNextCustomer();
        onlineMonitor.displayCurrentQueueNumber();

        station3.serveNextCustomer();
        onlineMonitor.displayCurrentQueueNumber();

        
        station1.resetQueueNumber(50);
        onlineMonitor.displayCurrentQueueNumber();

    
        station2.serveNextCustomer();
        station3.serveNextCustomer();
        onlineMonitor.displayCurrentQueueNumber();
    }
}