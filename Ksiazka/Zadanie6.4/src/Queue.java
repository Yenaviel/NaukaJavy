public class Queue {
    private char q[]; //tablica przechowujaca elementy kolejki
    private int putlock, getlock; // indeksy operacji put i get


    // Tworzy pusta kolejke o podanym wymiarze
    Queue(int size) {
        q = new char[size]; // przydziela pamiec kolejki
        putlock = getlock = 0;
    }

    // Umieszcza znak w kolejce
    void put(char ch) {
        if (putlock == q.length) {
            System.out.println("--- Kolejka pełna!");
            return;
        }
        q[putlock++] = ch;
        System.out.println("Dodano do kolejki!");
    }

    char get() {
        if (getlock == putlock) {
            System.out.println("-- Kolejka pusta!");
            return (char) 0;
        }
        return q[q.length-1];
    }
}