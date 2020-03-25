public class Bank {
    public static void main(String [] args){
        Person osoba1 = new Person();
        osoba1.imie = "Dawid";
        osoba1.nazwisko = "Kokot";
        osoba1.miejscowosc = "Pińczów";


        Person osoba2 = new Person();
        osoba2.imie = "Magda";
        osoba2.nazwisko = "Jachna";
        osoba2.miejscowosc = "Pińczów";

        AdresZamieszkania zameldowanie = new AdresZamieszkania();
        zameldowanie.miejscowosc = "Chicago";

        osoba1.miejscowoscZameldowania = zameldowanie;

        KontoBankowe konto1 = new KontoBankowe();
        konto1.posiadacz = osoba1;
        konto1.balance = 10.000;

        KontoBankowe konto2 = new KontoBankowe();
        konto2.posiadacz = osoba2;
        konto2.balance = 5.000;

        System.out.println("Osoba 1: ");
        System.out.println(osoba1.imie + " " + osoba1.nazwisko);
        System.out.println("mieszka w miejscowości: " + osoba1.miejscowoscZameldowania.zipCode);
        System.out.println("Posiada konto bankowe z kwota: " + konto1.balance);

        System.out.println("Osoba 2: ");
        System.out.println(osoba2.imie + " " + osoba2.nazwisko);
        System.out.println("mieszka w miejscowości: " + osoba2.miejscowosc);
        System.out.println("Posiada konto bankowe z kwota: " + konto2.balance);


    }
}
