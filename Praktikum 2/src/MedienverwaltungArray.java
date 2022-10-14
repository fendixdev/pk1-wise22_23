public class MedienverwaltungArray {

    //Verwaltung mittels Array/Feld

    Medium[] medienliste = new Medium[10];
    int size = 0;

    public void aufnehmen(Medium m) {
        if (size < 10) {
            medienliste[size] = m;
            size++;
        } else {
            System.out.println("Medienliste ist voll!");
        }
    }

    public void zeigeMedien() {
        for (int i = 0; i < size; i++) {
            medienliste[i].druckeDaten();
        }
    }

    public void zeigeMedienES() {
        for (Medium m : medienliste) {
            if (m != null) {
                m.druckeDaten();
            }
        }
    }

    public void sucheNeuesMedium() {
        if (medienliste[0] != null) {
            Medium neuesMedium = medienliste[0];
            for (Medium m : medienliste) {
                if (m != null && m.getAlter() < neuesMedium.getAlter()) {
                    neuesMedium = m;
                }
            }
            System.out.printf("Das jüngste Medium \"%s\" ist %d Jahre alt. ", neuesMedium.getTitel(), neuesMedium.getAlter());
        }
    }

    public double berechneErscheinungsjahr() {
        double sum = 0;
        if (size != 0) {
            for (Medium m : medienliste) {
                if (m != null) {
                    sum += m.getAlter();
                }
            }
            System.out.printf("Das durchschnittliche Erscheinungsjahr ist %.2f.\n", sum / size);
            return sum / size;
        }
        return 0.0;
    }

}
