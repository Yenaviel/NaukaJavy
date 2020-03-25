public class Apple extends Fruit {
    private String odmiana;
    public static final String TYP = "jabłkowaty";

    public Apple(int waga, String odmiana) {
        super(waga, TYP);
        this.odmiana = odmiana;
    }

    public String getOdmiana() {
        return odmiana;
    }

    public void setOdmiana(String odmiana) {
        this.odmiana = odmiana;
    }

    public static String getTYP() {
        return TYP;
    }

    public void getInfo() {
        super.get_info();
        System.out.println(", odmiana:" + odmiana);
    }

}
