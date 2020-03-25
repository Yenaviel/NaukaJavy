public class Zadanie {
    public static void main(String[] args)
    throws java.io.IOException {

        char znak, ignore;
        int licznik = 0;

        do {
            System.out.println("Podaj znak jaki chcesz zamienic na wiekszy!");
            znak = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (znak >= 97 && znak <= 122) {
                System.out.println((char)(znak - 32));
                licznik ++;
            } else {
                System.out.println(znak);
            }

        } while (znak != '.');
        System.out.println("Wykonano zmian: " + licznik);
    }
}
