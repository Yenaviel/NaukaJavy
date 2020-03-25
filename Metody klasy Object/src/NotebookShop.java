public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("Asus", 1));
        dataStore.add(new Computer("Asus", 1));
        dataStore.add(new Computer("Dell", 2));

        System.out.println(dataStore.getInfo());
        dataStore.checkAvailability(new Computer("Dell", 1));
    }
}
