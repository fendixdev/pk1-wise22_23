import javax.swing.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Medienverwaltung mv = new Medienverwaltung();
        Scanner sc = new Scanner(System.in);
        boolean beendet = false;

        //Beispieldaten
        Audio a1 = new Audio("The Beatles", "Yesterday", 1965, 200);
        Audio a2 = new Audio("David Guetta", "Titanium", 2011, 347);
        Bild b1 = new Bild("Mona Lisa", 1503, "Paris");
        mv.aufnehmen(a1);
        mv.aufnehmen(a2);
        mv.aufnehmen(b1);

        do {
            //Auswahl
            System.out.println("\n1. Audio aufnehmen\n2. Bild aufnehmen\n3. Zeige alle Medien\n4. Zeige neues Medium\n5. Berechne durchschnittliches Erscheinungsjahr\n6. Beenden\n");
            System.out.print("Auswahl: ");
            int auswahl = sc.nextInt();

            switch (auswahl) {
                case 1 -> {
                    String interpret = JOptionPane.showInputDialog(null, "Interpret");
                    String titel = JOptionPane.showInputDialog(null, "Titel");
                    int jahr = Integer.parseInt(JOptionPane.showInputDialog(null, "Jahr"));
                    int dauer = Integer.parseInt(JOptionPane.showInputDialog(null, "Dauer"));
                    mv.aufnehmen(interpret, titel, jahr, dauer);
                }
                case 2 -> {
                    String titel = JOptionPane.showInputDialog(null, "Titel");
                    int jahr = Integer.parseInt(JOptionPane.showInputDialog(null, "Jahr"));
                    String ort = JOptionPane.showInputDialog(null, "Ort");
                    mv.aufnehmen(titel, jahr, ort);
                }
                case 3 -> mv.zeigeMedien();
                case 4 -> mv.sucheNeuesMedium();
                case 5 -> mv.berechneErscheinungsjahr();
                case 6 -> beendet = true;

            }
        } while (!beendet);
    }
}
