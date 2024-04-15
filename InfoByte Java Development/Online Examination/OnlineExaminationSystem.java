import java.util.Scanner;

public class OnlineExaminationSystem {
    private static String loggedInUser = null;
    private static boolean sessionActive = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (!sessionActive) {
                System.out.println("Welcome to the Online Examination System!");
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                if (login(username, password)) {
                    System.out.println("Login successful!");
                    sessionActive = true;
                    loggedInUser = username;
                } else {
                    System.out.println("Invalid username or password. Please try again.");
                }
            } else {
                System.out.println("1. Update Profile");
                System.out.println("2. Change Password");
                System.out.println("3. Select Answers for MCQs");
                System.out.println("4. Logout");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        updateProfile();
                        break;
                    case 2:
                        changePassword();
                        break;
                    case 3:
                        selectAnswers();
                        break;
                    case 4:
                        logout();
                        sessionActive = false;
                        loggedInUser = null;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            }
        }
    }

    private static boolean login(String username, String password) {
        // Your login logic here (e.g., check against a database)
        // For simplicity, I'm using hardcoded values
        return username.equals("user1") && password.equals("password1");
    }

    private static void updateProfile() {
        System.out.println("Update Profile feature is not implemented yet.");
    }

    private static void changePassword() {
        System.out.println("Change Password feature is not implemented yet.");
    }

    private static void selectAnswers() {
        System.out.println("Select Answers for MCQs feature is not implemented yet.");
    }

    private static void logout() {
        System.out.println("Logout successful.");
    }
}
