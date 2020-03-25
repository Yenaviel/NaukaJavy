public class Rekurencja {
   char reku (char [] lancuch, int i) {
       if (i >= 0) {
           System.out.print(lancuch[i]);

       i--;
       return reku(lancuch, i);
   } return 0;
   }
}
