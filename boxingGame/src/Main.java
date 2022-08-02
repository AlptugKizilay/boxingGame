public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Alp", 26, 95, 100, 20, 0);
        Fighter f2 = new Fighter("Eren", 27, 80, 100, 10, 50);

        Match m1 = new Match(100, 70, 40, 18, f1, f2);
        m1.run();
    }
}
