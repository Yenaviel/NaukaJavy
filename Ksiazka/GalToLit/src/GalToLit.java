public class GalToLit {
    public static void main(String[] args) {
        int litry = 0;
        double galony;
        int counter = 0;


        for (int i = 0; i <= 100; i++) {
            galony = litry * 3.78;
            System.out.println(galony + " galonow to: " + litry + " litrów!");
            counter++;
            litry++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
