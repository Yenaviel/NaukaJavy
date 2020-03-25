public class Wielowymiarowe {
    public static void main (String [] args) {
        double[][] plansza = new double[3][3];
        plansza[0][0] = 1.0;
        plansza[0][1] = 1.5;
        plansza[0][2] = 2.0;
        plansza[1][0] = 1.5;
        plansza[1][1] = 2.0;
        plansza[1][2] = 2.5;
        plansza[2][0] = 2.0;
        plansza[2][1] = 2.5;
        plansza[2][2] = 3.0;

        System.out.println("Sumę iloczynów przekątnych tablicy: ");
        System.out.println((plansza[0][0]*plansza[1][1]*plansza[2][2])+(plansza[0][2]*plansza[1][1]*plansza[2][0]));
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny tablicy: ");
        System.out.println((plansza[0][1]+plansza[1][1]+plansza[2][1])*(plansza[1][0]+plansza[1][1]+plansza[1][2]));
        System.out.println("Sumę wszystkich elementów znajdujących się przy krawędzi tablicy :");
        System.out.println(plansza[0][0]+plansza[0][1]+plansza[0][2]+plansza[1][2]+plansza[2][2]+plansza[2][1]+plansza[2][0]+plansza[1][0]);


    }
}
