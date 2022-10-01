import java.util.Objects;

public class NotFlyBirds extends Birds {
    private final String typeOfMovement;

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public NotFlyBirds(String name, int yearOfBirth, String livingEnvironment, String typeOfMovement) {
        super(name, yearOfBirth, livingEnvironment);
        this.typeOfMovement = "гулять!";
    }

    @Override
    public void eat() {
        System.out.println("я ем насекомых!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotFlyBirds)) return false;
        if (!super.equals(o)) return false;
        NotFlyBirds that = (NotFlyBirds) o;
        return typeOfMovement.equals(that.typeOfMovement);
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
