import java.time.LocalDate;
import java.util.Objects;

public abstract class Medium implements Comparable<Medium> {

    private int id;
    private static int idCounter;
    private String titel;
    private int jahr;

    public Medium(String titel, int jahr) {
        this.id = idCounter++;
        this.titel = titel;
        this.jahr = jahr;
    }

    public int getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public int getAlter() {
        return LocalDate.now().getYear() - jahr;
    }

    public abstract void druckeDaten();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medium medium = (Medium) o;
        return jahr == medium.jahr && Objects.equals(getTitel(), medium.getTitel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitel(), jahr);
    }

    @Override
    public int compareTo(Medium m){
        if(this.getAlter() < m.getAlter()) return -1;
        if(this.getAlter() > m.getAlter()) return 1;
        return 0;
    }
}
