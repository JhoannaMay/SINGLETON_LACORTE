public class QueueManager {
    private static QueueManager instance; // Singleton instance
    private int currentQueueNumber;

    
    private QueueManager() {
        currentQueueNumber = 1; // Initialize starting queue number
    }

    
    public static synchronized QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    // Method to get the next queue number
    public synchronized int getNextQueueNumber() {
        return currentQueueNumber++;
    }

    // Method to reset the queue number based on a specific input
    public synchronized void resetQueueNumber(int newQueueNumber) {
        currentQueueNumber = newQueueNumber;
    }

    // Method to get the current queue number without incrementing
    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }
}