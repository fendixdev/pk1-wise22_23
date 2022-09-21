public class Main {

    public static void main(String[] args) {
        System.out.println("Starting...");

        Audio a1 = new Audio("The Beatles", "Yesterday", 1965, 200);
        Bild b1 = new Bild("Mona Lisa", 1503, "Paris");


        a1.druckeDaten();
        b1.druckeDaten();
        System.out.printf("%s ist %d Jahre alt\n", b1.getTitel(), b1.alter());
    }
}