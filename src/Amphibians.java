import java.util.Objects;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String name, int yearOfBirth, String livingEnvironment) {
        super(name, yearOfBirth);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public void eat() {
        System.out.println("я ем насекомых!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibians)) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return livingEnvironment.equals(that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public void go() {
        System.out.println("я люблю гулять и охотиться!");
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "не определено";
        } else {

            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "name='" + super.getName() + '\'' +
                ", yearOfBirth=" + super.getYearOfBirth() +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
