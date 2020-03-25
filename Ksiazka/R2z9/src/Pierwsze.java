
public class Pierwsze {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i/2; j++) {
                if ( i % j == 0) {
                    break;
                } else {
                    if (i % 3 == 0) {
                        break;
                    } else if (i % 5 == 0) {
                        break;
                    } else {
                        System.out.println(i);
                        break;
                    }
                }
                }

            }
        }
    }




