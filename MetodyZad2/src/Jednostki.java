public class Jednostki {

    int metryNaCentymetry (int metry) {
        return (metry*100);
    }

    int centymetryNaMilimetry (int metryNaCentymetry) {
        return (metryNaCentymetry*10);
    }

    int centyNaMetery (int centy) {
        return (centy/100);
    }

    int milicentyNaMetry (int milicenty){
        return (milicenty/1000);
    }

    int godzinyNaMin (int godziny){
        return (godziny*60);
    }

    int minNaSec (int godzinyNaMin) {
        return(godzinyNaMin*60);
    }
    int secNaMilisec (int minNaSec) {
        return (minNaSec*1000);
    }
}
