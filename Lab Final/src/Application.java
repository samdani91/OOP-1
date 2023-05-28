import java.util.*;
public class Application {
    private ArrayList<AuthenticationInfo> loginRecords;

    public Application() {
        loginRecords = new ArrayList<>();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Password Manager");
            System.out.println("1. New Login Info");
            System.out.println("2. View Login Info");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createLoginRecord();
                    break;
                case 2:
                    viewLoginRecord();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }

    private void createLoginRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter URL: ");
        String url = scanner.nextLine();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        AuthenticationInfo authInfo = new AuthenticationInfo(url, username, password);
        String encryptedPass=EncryptionUtil.encrypt(authInfo.getPassword(),2);
        AuthenticationInfo encryptedAuthInfo = new AuthenticationInfo(url,username,encryptedPass);

        loginRecords.add(encryptedAuthInfo);
        System.out.println("Login info added successfully.");
    }


    private void viewLoginRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter URL: ");
        String url = scanner.nextLine();

        AuthenticationInfo authInfo = findLoginRecord(url);

        if (authInfo != null) {
            String decryptedPass=EncryptionUtil.decrypt(authInfo.getPassword(),2);
            AuthenticationInfo decryptedAuthInfo = new AuthenticationInfo(url, authInfo.getUsername(), decryptedPass);
            System.out.println("URL: " + decryptedAuthInfo.getURL());
            System.out.println("Username: " + decryptedAuthInfo.getUsername());
            System.out.println("Password: " + decryptedAuthInfo.getPassword());
        } else {
            System.out.println("No login info found for the given URL.");
        }
    }

    private AuthenticationInfo findLoginRecord(String url) {
        for (AuthenticationInfo authInfo : loginRecords) {
            if (authInfo.getURL().equals(url)) {
                return authInfo;
            }
        }
        return null;
    }

}

