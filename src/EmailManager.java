import java.util.HashSet;
import java.util.Scanner;

public class EmailManager {

    private HashSet<String> emails;

    public EmailManager() {
        emails = new HashSet<>();
    }

    public void addEmail(String email) {
        if (isValidEmail(email)) {
            emails.add(email);
            System.out.println("Email добавлен: " + email);
        }
        else {
            System.out.println("Некорректный email: " + email);
        }
    }

    public void listEmails() {
        System.out.println("Список email:");
        if (emails.isEmpty()) {
            System.out.println("Список пуст");
        }
        else {
            for (String email : emails) {
                System.out.println(email);
            }
        }
    }

    private boolean isValidEmail(String email) {
        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf(".", atIndex);
        return atIndex > 0 && dotIndex > atIndex && dotIndex < email.length() - 1;
    }

}