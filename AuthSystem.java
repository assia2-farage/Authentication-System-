     import java.util.Scanner;

        public class AuthSystem {
            public static void main(String[] args) {
                // Step 1: Initialize Variables
                final String VALID_USERNAME = "admin";
                final String VALID_PASSWORD = "password123";
                final int MAX_ATTEMPTS = 3;
                int attempts = 0;

                Scanner scanner = new Scanner(System.in);

                // Step 2: Loop Until Attempts Are Exhausted
                while (attempts < MAX_ATTEMPTS) {
                    // Step 3: Take User Input
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();

                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();

                    // Step 4: Validate Credentials
                    if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
                        System.out.println("Login successful. Access granted.");
                        break;
                    } else {
                        attempts++;
                        int remaining = MAX_ATTEMPTS - attempts;
                        if (remaining > 0) {
                            System.out.println("Invalid credentials. You have " + remaining + " attempt(s) remaining.\n");
                        } else {
                            System.out.println("Account blocked due to 3 failed login attempts.");
                        }
                    }
                }

                scanner.close();
            }
        }
