public class DataStore {
    private int computersNumber = 0;
    Computer[] computers = new Computer[100];


    void add(Computer computer) {
        if (computersNumber < 100) {
                computers[computersNumber] = computer;
                computersNumber++;
        }
    }

    String getInfo() {
        String result = "";
        for (int i = 0; i < computersNumber; i++) {
            result = result + computers[i].getInfo() + "\n";
        }
        return result;
    }

    void checkAvailability(Computer computer) {
        int liczba = 0;
         for (int i = 0; i <= computersNumber; i++) {
             if (computer.equals(computers[i])) {
                 liczba++;
             }
         }
        System.out.println("Mam takich kompow w bazie: " + liczba);
    }
}
