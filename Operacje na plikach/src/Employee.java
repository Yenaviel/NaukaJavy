import java.io.Serializable;

public class Employee  extends Person implements Serializable {
   private int wyplata;

    public Employee(String imie, String nazwisko, int wyplata) {
        super(imie, nazwisko);
        this.wyplata = wyplata;
    }

    public int getWyplata() {
        return wyplata;
    }

    public void setWyplata(int wyplata) {
        this.wyplata = wyplata;
    }
}
