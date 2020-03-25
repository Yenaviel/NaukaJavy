public class Test {
    public static void main(String [] args) {
        Part part1 = new Part("001", "Metabo", "Active", "AA001");
        Part part2 = new Part("002", "Metabo", "Metal", "AB001");
        Tire tire1 = new Tire("003", "Debica", "Frizo", "FrizoAAA1", 120, 90);
        ExhaustPart exhaustPart1 = new ExhaustPart("004", "Dymny", "Dymny2", "ZZD24", "TAK");

        part1.printInfo();
        part2.printInfo();
        tire1.printInfo();
        exhaustPart1.printInfo();

    }

}
