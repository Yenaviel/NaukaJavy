import java.util.Scanner;

public class Kalkulator {
    public static void main(String [] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj a?");
        a = scanner.nextInt();
        System.out.println("Podaj b?");
        b = scanner.nextInt();

        Shape prostokat = new Prostokat(a, b);
        Shape trojkat = new Trójkąt(a);

        System.out.println("Obwód prostokąta: " + prostokat.calculatePerimeter());
        System.out.println("Pole prostokąta: " + prostokat.calculateArea());
        System.out.println("Obwód trojkata: " + trojkat.calculatePerimeter());
        System.out.println("Pole trojkata: " + trojkat.calculateArea());



    }

}
