import java.util.*;

public class task5 {

    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isLoggedIn = false;
    private static String username;
    private static String password;
    private static String profileDetails;

    public static void main(String[] args) {
        while (true) {
            if (!isLoggedIn) {
                login();
            } else {
                displayMenu();
            }
        }
    }

    private static void login() {
        System.out.println("🔒 Login:");
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();
        
        // This is a placeholder for actual authentication
        if ("admin".equals(username) && "password".equals(password)) {
            isLoggedIn = true;
            profileDetails = "Default profile details";
            System.out.println("Successfully logged in!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void displayMenu() {
        System.out.println("\n1. 🔄 Update Profile and Password");
        System.out.println("2. ✅ Selecting Answers for MCQs");
        System.out.println("3. ⏰ Timer and Auto Submit");
        System.out.println("4. 🚪 Closing Session and Logout");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        switch (choice) {
            case 1:
                updateProfileAndPassword();
                break;
            case 2:
                handleMCQs();
                break;
            case 3:
                handleTimerAndAutoSubmit();
                break;
            case 4:
                logout();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void updateProfileAndPassword() {
        System.out.println("🛠️ Update Profile and Password:");
        System.out.print("Enter new profile details: ");
        profileDetails = scanner.nextLine();
        
        System.out.print("Enter new password: ");
        password = scanner.nextLine();
        
        System.out.println("Profile and password updated successfully.");
    }

    private static void handleMCQs() {
        System.out.println(" Answer the following MCQs:");
        System.out.println("1. What is the capital of France?");
        System.out.println("a. Berlin");
        System.out.println("b. Madrid");
        System.out.println("c. Paris");
        System.out.print("Choose an answer (a/b/c): ");
        String answer = scanner.nextLine();
        
        if ("c".equalsIgnoreCase(answer)) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer. The correct answer is c. Paris.");
        }
    }

    private static void handleTimerAndAutoSubmit() {
        System.out.println("⏳ Timer and Auto Submit:");
        long startTime = System.currentTimeMillis();
        
        System.out.println("You have 10 seconds to complete this task.");
        System.out.print("Press Enter to finish early or wait for 10 seconds: ");
        
        try {
            scanner.nextLine();
        } catch (Exception e) {
            // Handle exception
        }
        
        long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
        if (elapsedTime < 10) {
            System.out.println("Task finished early. Time taken: " + elapsedTime + " seconds.");
        } else {
            System.out.println("Time's up! Task auto-submitted.");
        }
    }

    private static void logout() {
        System.out.println("Logging out...");
        isLoggedIn = false;
        username = null;
        password = null;
        profileDetails = null;
        System.out.println("Logged out successfully.");
    }
}
