public class Przeliczanie {

    public static void main (String [] args) {
        int metry = 11;
        int centymetry = 12000;
        int milimetry = 130000;
        int godziny = 14;

        Jednostki jednostki = new Jednostki();
        System.out.println("Z metrów na centymetry: " + jednostki.metryNaCentymetry(metry));
        System.out.println("Z centymetrów na milimetry: " + jednostki.centymetryNaMilimetry(jednostki.metryNaCentymetry(metry)));
        System.out.println("Z centymetrów na metry: " + jednostki.centyNaMetery(centymetry));
        System.out.println("Z milimetrów na metry: " + jednostki.milicentyNaMetry(milimetry));
        System.out.println("Teraz godziny!");
        System.out.println("Z godzin na minuty: " + jednostki.godzinyNaMin(godziny));
        System.out.println("Z minut na sekundy: " + jednostki.minNaSec(jednostki.godzinyNaMin(godziny)));
        System.out.println("Z sekund na milisekundy: " + jednostki.secNaMilisec(jednostki.minNaSec(jednostki.godzinyNaMin(godziny))));

    }
}
