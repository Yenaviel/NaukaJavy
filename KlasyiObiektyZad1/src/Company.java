public class Company {
    public static void main(String [] args) {
        Employee pracownik1 = new Employee();
        pracownik1.imie = "Madzia";
        pracownik1.nazwisko = "Jachna";
        pracownik1.rokUrodzenia = 1994;
        pracownik1.stazPracy = 2;

        Employee pracownik2 = new Employee();
        pracownik2.imie = "Dawid";
        pracownik2.nazwisko = "Kokot";
        pracownik2.rokUrodzenia = 1992;
        pracownik2.stazPracy = 8;

        Employee pracownik3 = new Employee();
        pracownik3.imie = "Ricardo";
        pracownik3.nazwisko = "Gonzalez";
        pracownik3.rokUrodzenia = 1977;
        pracownik3.stazPracy = 15;

        String pracownik1Info = "Imie: " + pracownik1.imie
                + ", Nazwisko: " + pracownik1.nazwisko
                + ", Rok urodzenia: " + pracownik1.rokUrodzenia
                + ", Staż pracy: " + pracownik1.stazPracy;

        String pracownik2Info = "Imie: " + pracownik2.imie
                + ", Nazwisko: " + pracownik2.nazwisko
                + ", Rok urodzenia: " + pracownik2.rokUrodzenia
                + ", Staż pracy: " + pracownik2.stazPracy;

        String pracownik3Info = "Imie: " + pracownik3.imie
                + ", Nazwisko: " + pracownik3.nazwisko
                + ", Rok urodzenia: " + pracownik3.rokUrodzenia
                + ", Staż pracy: " + pracownik3.stazPracy;

        System.out.println(pracownik1Info);
        System.out.println(pracownik2Info);
        System.out.println(pracownik3Info);

    }
}
