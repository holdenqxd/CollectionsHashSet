import java.util.Scanner;

public class EmailCycle {
    public static void main(String[] args) {
    EmailManager manager = new EmailManager();
    Scanner scanner = new Scanner(System.in);

    while(true) {
        System.out.print("Введите команду (add, list, exit): ");
        String command = scanner.nextLine();

        switch (command) {
            case "add":
                System.out.print("Введите email: ");
                String email = scanner.nextLine();
                manager.addEmail(email);
                break;
            case "list":
                manager.listEmails();
                break;
            case "exit":
                System.out.println("Выход.");
                scanner.close();
                return;
            default:
                System.out.println("Неизвестная команда.");

        }

    }

    }
}

