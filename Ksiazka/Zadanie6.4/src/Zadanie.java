import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Jaka dlugosc ma miec tablica!");
        size = sc.nextInt();
        Queue test = new Queue(size);
        test.put('a');
        test.put('b');
        test.put('c');
        System.out.println(test.get());
    }
}
