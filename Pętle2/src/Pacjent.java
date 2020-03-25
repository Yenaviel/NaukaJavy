public class Pacjent {
    public String imie;
    public String nazwisko;
    public int pesel;


    public Pacjent(String imie, String nazwisko, int pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String getImie() {
        return this.imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPesel() {
        return this.pesel;
    }

    public void setPesel (int pesel) {
        this.pesel = pesel;
    }

    public void wyswietlanie () {
        String info = imie + " " + nazwisko + " " + pesel;
        System.out.println(info);
    }


}