public class Liczenie {
    public static void main (String [] args) {
        double a = 3.145;
        double b = 1.18;

        Kalkulator kalkulator = new Kalkulator();
        System.out.println(kalkulator.add(a,b));
        System.out.println(kalkulator.subtract(a,b));
        System.out.println(kalkulator.multiply(a,b));
        System.out.println(kalkulator.divide(a,b));
    }
}
