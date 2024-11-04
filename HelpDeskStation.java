public class HelpDeskStation {
    private QueueManager queueManager;
    private String stationName;

    public HelpDeskStation(String stationName) {
        this.queueManager = QueueManager.getInstance(); 
        this.stationName = stationName;
    }

    // Method to get the next queue number for a customer
    public void serveNextCustomer() {
        int queueNumber = queueManager.getNextQueueNumber();
        System.out.println(stationName + " is serving customer with queue number: " + queueNumber);
    }

    // Method to reset the queue number
    public void resetQueueNumber(int newQueueNumber) {
        queueManager.resetQueueNumber(newQueueNumber);
        System.out.println(stationName + " has reset the queue number to: " + newQueueNumber);
    }
}