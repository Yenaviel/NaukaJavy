public class Babelkowe {
    public static void main (String [] args){
        Sortable sorter = new Sortable() {
            @Override
            public int sort(int[] tab) {
                if (tab == null)
                    throw new NullPointerException("argument cannot be null");
                if(tab.length == 0)
                    throw new IllegalArgumentException("array has to have at least 1 value");

                int biggestNumber = tab[0];
                for(int i=0; i<tab.length-1; i++) {
                    if (tab[i] > tab[i+1]) {
                        tab[i+1] = tab[i];
                    }
                } return tab[tab.length-1];
            }

        };
        int[] tab = {11111, 10, 9999, -23, 1009, 2938, 153, 24};
        System.out.println("Największa z liczb to: " + sorter.sort(tab));
    }
}
