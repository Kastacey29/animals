import java.util.Objects;

public class Mammals extends Animals {
    private String livingEnvironment;
    private double speed;

    public Mammals(String name, int yearOfBirth, String livingEnvironment, double speed) {
        super(name, yearOfBirth);
        setLivingEnvironment(livingEnvironment);
        setSpeed(speed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "не определено";
        } else {

            this.livingEnvironment = livingEnvironment;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed <= 0) {
            this.speed = 1;
        } else {
            this.speed = speed;
        }
    }

    @Override
    protected void eat() {
        System.out.println("я ем ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammals)) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Double.compare(mammals.speed, speed) == 0 && livingEnvironment.equals(mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }

    @Override
    protected void go() {
        System.out.println("я люблю гулять и !");
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "name='" + super.getName() + '\'' +
                ", yearOfBirth=" + super.getYearOfBirth() +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", speed=" + speed +
                '}';
    }
}
