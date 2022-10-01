import java.util.Objects;

public class Herbivores extends Mammals {
    private String food;

    public Herbivores(String name, int yearOfBirth, String livingEnvironment, double speed, String food) {
        super(name, yearOfBirth, livingEnvironment, speed);
        setFood(food);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {

        if (food == null || food.isEmpty()) {

            this.food = "не определено";
        } else {
            this.food = food;
        }
    }

    @Override
    public void go() {
        System.out.println("я люблю гулять и пастись!");
    }

    @Override
    public void eat() {
        System.out.println("я ем " + this.food + "!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivores)) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return food.equals(that.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "name='" + super.getName() + '\'' +
                ", yearOfBirth=" + super.getYearOfBirth() +
                ", livingEnvironment='" + super.getLivingEnvironment() + '\'' +
                ", speed=" + super.getSpeed() +
                ", food='" + food + '\'' +
                '}';
    }
}
