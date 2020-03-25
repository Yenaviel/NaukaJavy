public class PrintService {
    public void wyswietl(Client client, double price, double priceDiscount1) {
        if (client.getFirstName() != null && client.getLastName() != null) {
        System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount1);
        } else {
            if (client.getLastName() == null && client.getFirstName() != null){
                System.out.println("Witaj " + client.getFirstName());
                System.out.println("Kwota przed rabatem: " + price);
                System.out.println("Do zapłaty (po rabacie): " + priceDiscount1);
            } else {
                if (client.getFirstName() == null && client.getLastName() != null) {
                    System.out.println("Dzien dobry pani/panie " + client.getLastName());
                    System.out.println("Kwota przed rabatem: " + price);
                    System.out.println("Do zapłaty (po rabacie): " + priceDiscount1);
                } else {
                    System.out.println("Witaj Nieznajomy!");
                    System.out.println("Kwota przed rabatem: " + price);
                    System.out.println("Do zapłaty (po rabacie): " + priceDiscount1);
                }
            }
        }

    }

}
