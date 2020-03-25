public class Kalkulator {

    public int calculator (int liczba1, int liczba2, String znak) {
        switch (znak) {
            case "+":
                return liczba1+liczba2;

            case "-":
                return liczba1-liczba2;

            case "*":
                return liczba1*liczba2;

            default:
                return liczba1/liczba2;
        }

    }
}
