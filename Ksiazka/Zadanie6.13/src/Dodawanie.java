public class Dodawanie {
    int dodaj (int... args) {
        int result = 0;
        for (int i = 0; i <= args.length-1; i++) {
            result = result + args[i];
        }
        return result;
    }
}
