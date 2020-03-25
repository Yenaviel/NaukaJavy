public class Tire extends Part {
    private int rozmiar;
    private int szerokosc;

    public Tire(String nr_ident, String nazwa_producenta, String model, String seria_produktu, int rozmiar, int szerokosc) {
        super(nr_ident, nazwa_producenta, model, seria_produktu);
        this.rozmiar = rozmiar;
        this.szerokosc = szerokosc;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

   public void printInfo(){
        String info = getNr_ident() + " " + getNazwa_producenta() + " " + getModel() + " " + getSeria_produktu() + " " + rozmiar + " " + szerokosc;
        System.out.println(info);
    }

}
