import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        int liczba;
        String wyraz;


        System.out.println("Ile chcesz podać wyrazów? ");
        liczba = sc.nextInt();
        System.out.println(liczba);

        for (int i=0; i<liczba; i++ ){
            System.out.println("Podaj kolejny wyraz?");
            wyraz = sc.next();
            int s1 = wyraz.length();
            char znak = wyraz.charAt(s1-1);
            builder.append(znak);

        }
        System.out.println(builder);

    }

}
