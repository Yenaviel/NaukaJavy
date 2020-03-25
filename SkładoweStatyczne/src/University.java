import java.util.Scanner;

public class University {
    public static void main(String [] args) {
        System.out.println(Student.LICZNIK);

        Student student0 = new Student("Dawid", "Kokot", 509011);
        Student student1 = new Student("Magda", "Jachna", 19940724);

        System.out.println(Student.LICZNIK);

    }
}
