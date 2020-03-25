public class Zadanie {
    public static void main(String[] args)
            throws java.io.IOException {

        char choise;
        char ignore;
        int licznik = 0;

        do {
            System.out.println("Podawaj znaki z klawiatury, podanie '.' konczy dzialanie programu!");

            choise = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
                licznik++;
            } while (ignore != '\n');

        } while (choise == '.');

        System.out.println("Zakończono program! Zanim podano kropke wpisano: " + licznik + " znakow!");
    }
}
