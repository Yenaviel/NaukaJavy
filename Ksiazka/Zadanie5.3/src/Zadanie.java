public class Zadanie {
    public static void main (String [] args) {
        double[] tablica = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};
        int i;
        double suma = 0;
        double srednia = 0;

        for (i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];
        }
        srednia = suma/tablica.length;

        System.out.println("Suma wyniosla: " + suma);
        System.out.println("średnia natomiast: "+ srednia );

    }
}
