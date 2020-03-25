import java.util.Scanner;

public class SzpitalApp {
    public static void main(String [] args) {
        Pacjent[] pc = new Pacjent[10];
        Scanner sc = new Scanner(System.in);
        int wybor;
        int liczbaPacjentow = 0;

        do {
            System.out.println("Witamy w systemie szpitala!");
            System.out.println("Wybierz co chcesz zrobic: ");
            System.out.println(" 0 - wyjście z programu.");
            System.out.println(" 1 - dopisanie pacjenta.");
            System.out.println(" 2 - wyświetlenie listy zapisanych pacjentów.");

            wybor = sc.nextInt();

            switch (wybor) {
                case 0:
                    System.out.println("Ok zamykamy program!");
                    break;
                case 1:
                    System.out.print("Ok, dopisujemy pacjenta.");
                    Szpital szpital = new Szpital();
                    pc[liczbaPacjentow] = szpital.dodaniePacjenta();
                    liczbaPacjentow++;
                    break;
                case 2:
                    for (liczbaPacjentow = 0; liczbaPacjentow < pc.length; liczbaPacjentow++){
                        pc[liczbaPacjentow].wyswietlanie();
                    }

                default:
                    throw new IllegalStateException("Unexpected value: " + wybor);
            }
        } while (wybor != 0);
    }
}
