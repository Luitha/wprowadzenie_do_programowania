import java.util.Scanner;

public class TextFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię ");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj wiek ");
        int age = scanner.nextInt();
        System.out.println("Witaj, " +imie +" " +nazwisko +" " +age);
    }
}
