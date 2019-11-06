import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginPassword {

    public static void main(String[] args) {
        Map<String, String> logAndPas = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество пользователей: ");
        int users = in.nextInt();
        for (int i = 0; i < users; i++) {
            System.out.println("Введите логин");
            String login = in.next();
            System.out.println("Введите пароль");
            String password = in.next();
            logAndPas.put(login, password);
        }
        while (true) {
            System.out.println("Введите логин по которому хотите найти пароль");
            String inputLogin = in.next();
            System.out.print("Пароль от логина " + inputLogin + ": ");
            System.out.println(logAndPas.get(inputLogin));
        }
    }

}