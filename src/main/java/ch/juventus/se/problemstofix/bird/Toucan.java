package ch.juventus.se.problemstofix.bird;


import java.util.Objects;

public class Toucan extends Bird {

    private String habitat;

    public Toucan(int age, double weight, boolean isHealthy) {
        super(age);
        this.setWeight(weight);
        this.setHeathy(isHealthy);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Toucan toucan = (Toucan) o;

        return Objects.equals(habitat, toucan.habitat);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (habitat != null ? habitat.hashCode() : 0);
        return result;
    }
}
