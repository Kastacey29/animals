import java.util.Objects;

public class FlyBirds extends Birds {
    private final String typeOfMovement;

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public FlyBirds(String name, int yearOfBirth, String livingEnvironment, String typeOfMovement) {
        super(name, yearOfBirth, livingEnvironment);
        this.typeOfMovement = "летать!";
    }

    @Override
    public void eat() {
        System.out.println("я ем насекомых!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlyBirds)) return false;
        if (!super.equals(o)) return false;
        FlyBirds flyBirds = (FlyBirds) o;
        return typeOfMovement.equals(flyBirds.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    @Override
    public void go() {
        System.out.println("я люблю охотиться и " + typeOfMovement);
    }

    @Override
    public String toString() {
        return "FlyBirds{" +
                "name='" + super.getName() + '\'' +
                ", yearOfBirth=" + super.getYearOfBirth() +
                ", livingEnvironment='" + super.getLivingEnvironment() + '\'' +
                ", typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }
}
