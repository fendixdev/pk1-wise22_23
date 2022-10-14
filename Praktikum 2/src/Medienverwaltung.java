import java.util.Collections;
import java.util.LinkedList;

public class Medienverwaltung {

    LinkedList<Medium> medienliste = new LinkedList<>();

    public void aufnehmen(Medium m) {
        medienliste.add(m);
    }

    public void zeigeMedien() {
        for (Medium m : medienliste) {
            m.druckeDaten();
        }
    }

    public void sucheNeuesMedium() {
        Collections.sort(medienliste);
        System.out.printf("Das jüngste Medium \"%s\" ist %d Jahre alt.\n", medienliste.getFirst().getTitel(), medienliste.getFirst().getAlter());
    }

    public double berechneErscheinungsjahr() {
        double counter = 0;
        double sum = 0;

        for (Medium m : medienliste) {
            sum += m.getAlter();
            counter++;
        }
        System.out.printf("Das durchschnittliche Erscheinungsjahr ist %.2f.\n", sum / counter);
        return sum / counter;
    }


}
