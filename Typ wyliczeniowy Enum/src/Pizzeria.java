import java.util.Scanner;

class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Dostępne pizze:");
        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Jaką pizzę wybierasz?");
        Pizza pi = Pizza.valueOf(input.nextLine());

        System.out.println("Dziękujemy za zamówienie pizzy " + pi.name());
        input.close();
    }
}