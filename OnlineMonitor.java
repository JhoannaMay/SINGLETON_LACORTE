public class OnlineMonitor {
    private QueueManager queueManager;

    public OnlineMonitor() {
        this.queueManager = QueueManager.getInstance(); 
    }

    // Display the current queue number
    public void displayCurrentQueueNumber() {
        System.out.println("Current queue number is: " + queueManager.getCurrentQueueNumber());
    }
}