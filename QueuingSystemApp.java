import java.util.Scanner;

public class QueuingSystemApp {
    public static void main(String[] args) {
        PagIbigCentralizedQueuingSystem queuingSystem = PagIbigCentralizedQueuingSystem.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pag-ibig Centralized Queuing System");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Get Current Queue Numbers");
            System.out.println("2. Set Queue Number");
            System.out.println("3. Reset Queue Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    queuingSystem.getCurrentQueueNumber();
                    break;
                case 2:
                    System.out.print("Enter new Queue Number: ");
                    int newQueueNumber = scanner.nextInt();
                    queuingSystem.resetQueueNumber(newQueueNumber);
                    break;
                case 3:
                    System.out.println("Queue Reset: Current Queue Number - " + queuingSystem.getCurrentQueueNumber());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
