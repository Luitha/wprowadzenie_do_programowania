import java.util.Scanner;

public class NoweZadanie {
    public static void main(String[] args) {
        /**
         * 1. Pytanie o nazwisko i wiek.
         * 2. Pętla sprawdzająca czy osoba jest pełnoletnia - pełnoletnia zapraszam do klubu, niepełnoletnia wypad
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię ");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko ");
        String nazwisko = scanner.next();
        System.out.println("Podaj wiek ");
        int wiek = scanner.nextInt();
        if (wiek>=18) {
            System.out.println("Zapraszam do klubu ");
        }
        if (wiek<18) {
            System.out.println("Wypad");
        }
    }
}
