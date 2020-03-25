import java.util.Scanner;

public class WprowadzanieDanych {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz pierwsza liczbe: ");
        int liczba1 = sc.nextInt();
        System.out.println("Wprowadz druga liczbe: ");
        int liczba2 = sc.nextInt();
        System.out.println("Wprowadz znak matematyczny (+,-,*,/) :");
        String znak = sc.next();


        Kalkulator kalkulator = new Kalkulator();
        System.out.println(kalkulator.calculator(liczba1, liczba2, znak));
        sc.close();

    }
}
