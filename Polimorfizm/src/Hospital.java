import java.util.Scanner;


public class Hospital {
    Scanner sc = new Scanner(System.in);
    Person[] persons = new Person[3];


    public Person add(int j) {
            System.out.println("Kogo chcesz dodać?");
            System.out.println("1 - Pielegniarka");
            System.out.println("2 - Doktor");
            int i = sc.nextInt();

            if (i == 1) {
                System.out.println("Imie?");
                String imie = sc.next();
                System.out.println("Nazwisko?");
                String nazwisko = sc.next();
                System.out.println("Kwota wypłaty?");
                double wypłata = sc.nextDouble();
                System.out.println("Ilosc nadgodzin?");
                int nadgodziny = sc.nextInt();
                return persons[j] = new Nurse(imie, nazwisko, wypłata, nadgodziny);
            } else {
                System.out.println("Imie?");
                String imie = sc.next();
                System.out.println("Nazwisko?");
                String nazwisko = sc.next();
                System.out.println("Kwota wypłaty?");
                double wypłata = sc.nextDouble();
                System.out.println("Bonus?");
                double bonus = sc.nextInt();
                return persons[j] = new Doctor(imie, nazwisko, wypłata, bonus);
            }
        }

        public void getInfo() {
        for (int i = 0; i < 3; i++){
            persons[i].printInfo();
        }
        }
    }



