import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Scanner sc = new Scanner(System.in);

        employees[0] = new Employee("Dawid", "Kokot", 500);
        employees[1] = new Employee("Magda", "Jachna", 1500);

        String fileName = "nowy.txt";


        try (
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs);
        ) {
            os.writeObject(employees[0]);
            os.writeObject(employees[1]);
            System.out.println("Zapisano obiekt do pliku");

        } catch (IOException e) {
            System.err.println("Bład zapisu pliku " + fileName);
            e.printStackTrace();
        }

    }
}
