import java.util.Objects;

public class Audio extends Medium {

    private String interpret;
    private int dauer;

    public Audio(String interpret, String titel, int jahr, int dauer) {
        super(titel, jahr);
        this.interpret = interpret;
        this.dauer = dauer;
    }

    public String getInterpret() {
        return interpret;
    }

    public int getDauer() {
        return dauer;
    }

    public void druckeDaten(){
        System.out.printf("ID: %d | Interpret: %s | Titel: %s | Alter: %d Jahre | Dauer: %d\n", super.getId(), this.getInterpret(), super.getTitel(), super.getAlter(), getDauer());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Audio audio = (Audio) o;
        return getDauer() == audio.getDauer() && Objects.equals(getInterpret(), audio.getInterpret());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getInterpret(), getDauer());
    }
}
