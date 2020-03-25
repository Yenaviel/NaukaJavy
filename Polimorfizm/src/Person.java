public class Person {
    private String imie;
    private String nazwisko;
    private double wypłata;

    public Person(String imie, String nazwisko, double wypłata) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wypłata = wypłata;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getWypłata() {
        return wypłata;
    }

    public void setWypłata(double wypłata) {
        this.wypłata = wypłata;
    }

    public void printInfo() {
        String info = getImie() + "; " + getNazwisko()+ "; " + getWypłata();
        System.out.print(info);
    }
}

