import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) throws UnknownOperatorException {
        Scanner sc = new Scanner(System.in);
        int liczba1 = 0;
        int liczba2 = 0;
        boolean error = true;

        do {
            try {
                System.out.println("Podaj pierwsza liczbe?");
                liczba1 = sc.nextInt();
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Nie podales liczby calkowitej, sproboj ponownie!");
                sc.nextLine();
            }
        } while (error);
        error = true;
        do {
            try {
                System.out.println("Podaj druga liczbe?");
                liczba2 = sc.nextInt();
                error = false;
            } catch (InputMismatchException ee) {
                System.out.println("Nie podales liczby calkowitej, sproboj ponownie!");
                sc.nextLine();
            }
        } while (error);


        Pomocnicza pomoc = new Pomocnicza();
        pomoc.obliczenia(liczba1,liczba2);


    }

}
