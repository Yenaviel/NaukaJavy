public class Doctor extends Person {
    private double bonus;

    public Doctor(String imie, String nazwisko, double wypłata, double bonus) {
        super(imie, nazwisko, wypłata);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(";" + getBonus());
    }
}
