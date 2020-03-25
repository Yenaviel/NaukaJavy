import java.util.Random;

public class OperacjeNaZmiennych {
    public static void main(String [] args) {
        Random rand = new Random();
        int number = rand.nextInt(10);
        int number2 = rand.nextInt(10);
        boolean result;

        System.out.println(number);
        System.out.println(number2);

        System.out.println("Czy x jest większe od y?");
        result = (number>number2);
        System.out.println(result);

        System.out.println("Czy x pomnożone przez 2 jest większe od y?");
        result = (number*2>number2);
        System.out.println(result);

        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?");
        result = ((number+3>number2) && (number-2<number2));
        System.out.println(result);

        System.out.println("Czy iloczyn liczb x i y jest parzysty?");
        result = (((number*number2)%2) == 0);
        System.out.println(result);
    }

}
