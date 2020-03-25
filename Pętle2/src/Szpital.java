import java.util.Scanner;

public class Szpital {


   public Pacjent dodaniePacjenta () {

       Scanner sc = new Scanner(System.in);
       System.out.print("Podaj imie pacjenta: ");
       String imie = sc.next();
       System.out.println("Podaj nazwisko pacjenta: ");
       String nazwisko = sc.next();
       System.out.print("Podaj pesel pacjenta: ");
       int pesel = sc.nextInt();
       System.out.println("Dodano pacjenta!!!");
       return new Pacjent (imie, nazwisko, pesel);
   }

   public void wyswietlanie (Pacjent pacjent) {
       String info = pacjent.imie + " " + pacjent.nazwisko + " " + pacjent.pesel;
       System.out.println(info);
   }

}

