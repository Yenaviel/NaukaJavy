import java.util.Scanner;

public class Zadanie1 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba = 0;

        System.out.println("Ile chcesz zsumować liczb?");
        int ileLiczb = scanner.nextInt();

        for(int i=0; i<ileLiczb; i++) {
            System.out.println("Podaj liczbe do zsumowania: ");
            liczba = liczba + scanner.nextInt();
        }
        System.out.println("Po zsumowaniu " + ileLiczb + " liczb wyszło: " + liczba);
        scanner.close();
    }
}
