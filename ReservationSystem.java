import java.util.Scanner;

public class ReservationSystem {
    private static String loginId = "admin";
    private static String password = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enteredLoginId, enteredPassword;

        System.out.println("=== Login Form ===");
        System.out.print("Enter login ID: ");
        enteredLoginId = scanner.nextLine();
        System.out.print("Enter password: ");
        enteredPassword = scanner.nextLine();

        if (validateLogin(enteredLoginId, enteredPassword)) {
            System.out.println("Login successful!");
            showReservationForm();
        } else {
            System.out.println("Invalid login credentials. Exiting...");
        }
    }

    private static boolean validateLogin(String enteredLoginId, String enteredPassword) {
        return enteredLoginId.equals(loginId) && enteredPassword.equals(password);
    }

    private static void showReservationForm() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Reservation Form ===");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter train number: ");
        int trainNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character
        System.out.print("Enter class type: ");
        String classType = scanner.nextLine();
        System.out.print("Enter date of journey: ");
        String dateOfJourney = scanner.nextLine();
        System.out.print("Enter source: ");
        String source = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        // Perform reservation logic here

        System.out.println("Reservation successful!");
        showCancellationForm();
    }

    private static void showCancellationForm() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Cancellation Form ===");
        System.out.print("Enter PNR number: ");
        String pnrNumber = scanner.nextLine();

        // Retrieve reservation information for the provided PNR number
        // If reservation exists, display the information

        System.out.print("Press OK to confirm cancellation (or any other key to exit): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("OK")) {
            // Perform cancellation logic here
            System.out.println("Cancellation successful!");
        } else {
            System.out.println("Cancellation not confirmed. Exiting...");
        }
    }
}
