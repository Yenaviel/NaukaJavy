public class Nurse extends Person {
    private int nadgodziny;

    public Nurse(String imie, String nazwisko, double wypłata, int nadgodziny) {
        super(imie, nazwisko, wypłata);
        this.nadgodziny = nadgodziny;
    }

    public int getNadgodziny() {
        return nadgodziny;
    }

    public void setNadgodziny(int nadgodziny) {
        this.nadgodziny = nadgodziny;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("; " + getNadgodziny());
    }
}