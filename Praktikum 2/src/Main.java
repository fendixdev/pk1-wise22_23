public class Main {

    public static void main(String[] args) {
        System.out.println("Starting...");

        MedienverwaltungArray mvA = new MedienverwaltungArray();
        Medienverwaltung mv = new Medienverwaltung();

        Audio a1 = new Audio("The Beatles", "Yesterday", 1965, 200);
        Audio a2 = new Audio("David Guetta", "Titanium", 2011, 347);
        Bild b1 = new Bild("Mona Lisa", 1503, "Paris");

        System.out.println("Medienverwaltung - Array:");
        mvA.aufnehmen(a1);
        mvA.aufnehmen(b1);
        mvA.aufnehmen(a2);
        mvA.berechneErscheinungsjahr();
        mvA.sucheNeuesMedium();

        System.out.println("\n\nMedienverwaltung:");
        mv.aufnehmen(a1);
        mv.aufnehmen(b1);
        mv.aufnehmen(a2);
        mv.berechneErscheinungsjahr();
        mv.sucheNeuesMedium();

        System.out.println("Done!");
    }
}