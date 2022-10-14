import java.util.Objects;

public class Bild extends Medium {
    private String ort;

    public Bild(String titel, int jahr, String ort) {
        super(titel, jahr);
        this.ort = ort;
    }

    public String getOrt() {
        return ort;
    }

    public void druckeDaten(){
        System.out.printf("ID: %d | Titel: %s | Alter: %d Jahre | Ort: %s\n", super.getId(), super.getTitel(), super.getAlter(), getOrt());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bild bild = (Bild) o;
        return Objects.equals(getOrt(), bild.getOrt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getOrt());
    }
}
