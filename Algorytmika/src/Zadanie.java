import java.util.Scanner;

public class Zadanie {
    public static void main(String [] args) {
        int[] tablica = new int[100];
        int suma = 0;
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Podaj liczbe");
            tablica[i] = scanner.nextInt();
            if (tablica[i] < 100) {
                suma = suma + tablica[i];
                i++;
            } else {
                    System.out.println("Suma wyszla: " + suma);
            }


        } while (tablica[i] <= 100);

        if (suma % 2 == 0){
            System.out.println("Suma jest parzysta!");
        } else {
            System.out.println("Suma jest nieparzysta!");
        }

        scanner.close();
    }
}
