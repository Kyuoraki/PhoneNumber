import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона:");
        Scanner sc = new Scanner(System.in);
        String clear = sc.nextLine().replaceAll("[^0-9]", "").replaceFirst("[8]", "7");
        if (clear.length() == 11) {
            if (clear.length() - 1 == 7 || clear.length() - 1 == 8) {
                System.out.println(clear);
            } else System.out.println("Номер неверный.");
        }
        if (clear.length() == 10) {
            System.out.println("7" + clear);
        } else if (clear.length() < 10 || clear.length() > 11) {
            System.out.println("Номер неверный.");
        }

    }
}
