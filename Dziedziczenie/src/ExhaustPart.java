public class ExhaustPart extends Part {
    private String europejski_spalin;

    public ExhaustPart(String nr_ident, String nazwa_producenta, String model, String seria_produktu, String europejski_spalin) {
        super(nr_ident, nazwa_producenta, model, seria_produktu);
        this.europejski_spalin = europejski_spalin;
    }

    public String getEuropejski_spalin() {
        return europejski_spalin;
    }

    public void setEuropejski_spalin(String europejski_spalin) {
        this.europejski_spalin = europejski_spalin;
    }

    public void printInfo() {
        String info = getNr_ident() + " " + getNazwa_producenta() + " " + getModel() + " " + getSeria_produktu() + " " + europejski_spalin;
        System.out.println(info);
    }
}
