public class Zadanie {
    public static void main(String[] args) {
        char znaki[] = {'c', 'r', 'y', 'u', 'a', 'b'};

        int a, b;
        char t;

        System.out.println("Wyswietl oryginalna tablice!");
        for (int i = 0; i < znaki.length; i++) {
            System.out.print(" " + znaki[i]);
        }
        System.out.println();

        for (a = 1; a < znaki.length; a++) {
            for(b = znaki.length - 1; b >= a; b--) {
                if (znaki[b-1] > znaki[b]) {
                    t = znaki[b-1];
                    znaki[b-1] = znaki[b];
                    znaki[b] = t;
                }
            }
        }

        System.out.println("Posortowana tablica:");
        for(int i = 0; i < znaki.length; i++) {
            System.out.print(" " + znaki[i]);
        }
        System.out.println(" Koniec!");

    }
}
