public class Fruit {
    private double waga;
    private String typ_owocu;

    public Fruit(int waga, String typ_owocu) {
        this.waga = waga;
        this.typ_owocu = typ_owocu;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public String getTyp_owocu() {
        return typ_owocu;
    }

    public void setTyp_owocu(String typ_owocu) {
        this.typ_owocu = typ_owocu;
    }

    public void get_info() {
        String info = "Waga: " + waga + ", typ owocu: " + typ_owocu;
        System.out.print(info);
    }
}
