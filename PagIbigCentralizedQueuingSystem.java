public class PagIbigCentralizedQueuingSystem {
    private static PagIbigCentralizedQueuingSystem instance;
    private int currentQueueNumber;

    private PagIbigCentralizedQueuingSystem() {
        // Initialize the queue number
        currentQueueNumber = 1;
    }

    public static synchronized PagIbigCentralizedQueuingSystem getInstance() {
        if (instance == null) {
            instance = new PagIbigCentralizedQueuingSystem();
        }
        return instance;
    }

    // Public method to get the current queue number
    public int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    // Public method to reset the queue number based on an inputted number
    public void resetQueueNumber(int newQueueNumber) {
        // Perform validation or additional logic if needed
        currentQueueNumber = newQueueNumber;
    }

    // Public method to increment the queue number
    public void incrementQueueNumber() {
        currentQueueNumber++;
    }

    public static void main(String[] args) {
        // Example usage
        PagIbigCentralizedQueuingSystem queuingSystem = PagIbigCentralizedQueuingSystem.getInstance();

        // Simulate queuing and monitoring
        for (int i = 0; i < 5; i++) {
            System.out.println("Current Queue Number: " + queuingSystem.getCurrentQueueNumber());

            // Simulate serving a customer
            queuingSystem.incrementQueueNumber();

            // Simulate remote monitoring
            System.out.println("Remote Monitoring: Current Queue Number - " + queuingSystem.getCurrentQueueNumber());

            // Simulate resetting the queue number
            queuingSystem.resetQueueNumber(10);
            System.out.println("Queue Reset: Current Queue Number - " + queuingSystem.getCurrentQueueNumber());

            // Simulate serving more customers
            queuingSystem.incrementQueueNumber();
            queuingSystem.incrementQueueNumber();
        }
    }
}
