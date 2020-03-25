public class Part {
    private String nr_ident;
    private String nazwa_producenta;
    private String model;
    private String seria_produktu;

    public String getNr_ident() {
        return nr_ident;
    }

    public void setNr_ident(String nr_ident) {
        this.nr_ident = nr_ident;
    }

    public String getNazwa_producenta() {
        return nazwa_producenta;
    }

    public void setNazwa_producenta(String nazwa_producenta) {
        this.nazwa_producenta = nazwa_producenta;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeria_produktu() {
        return seria_produktu;
    }

    public void setSeria_produktu(String seria_produktu) {
        this.seria_produktu = seria_produktu;
    }

    public Part(String nr_ident, String nazwa_producenta, String model, String seria_produktu) {
        this.nr_ident = nr_ident;
        this.nazwa_producenta = nazwa_producenta;
        this.model = model;
        this.seria_produktu = seria_produktu;
    }

    public void printInfo() {
        String info = nr_ident + " " + nazwa_producenta + " " + model + " " + seria_produktu;
        System.out.println(info);
    }
}
