import java.util.Scanner;

public class Pomocnicza {

    void obliczenia(int liczba1, int liczba2) throws UnknownOperatorException {
        String znak;
        Scanner sm = new Scanner(System.in);
        System.out.println("Podaj znak operacji?");
        znak = sm.next();
        if ((znak == "+") || (znak == "-") || (znak == "*") || (znak == "/"))
            throw new UnknownOperatorException("Podales zly znak, operacja nie wykona sie!");
        switch (znak) {
            case "+":
                System.out.println("Wynikiem dodawania jest: " + (liczba1 + liczba2));
                break;
            case "-":
                System.out.println("Wynikiem odejmowania jest: " + (liczba1 - liczba2));
                break;
            case "*":
                System.out.println("Wynikiem mnozenia jest: " + (liczba1 * liczba2));
                break;
            case "/":
                if (liczba2 == 0)
                    throw new ArithmeticException("Podales zero jako dzielnik");
                else {
                    System.out.println("Wynikiem dzielenia jest: " + (liczba1 / liczba2));
                }


        }

    }
}
