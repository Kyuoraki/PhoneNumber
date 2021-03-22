import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона:");
        Scanner sc = new Scanner(System.in);
        String clear = sc.nextLine().replaceAll("[^0-9]", "").replaceFirst("[8]", "7");
        String first = String.valueOf(clear.charAt(0));
        if (clear.length() == 11 && first.equals("7")) {
            System.out.println(clear + "пачиму");
        }else if (clear.length() == 10) {
            System.out.println("7" + clear);
        }else System.out.println("Номер неверный.");
    }
}
