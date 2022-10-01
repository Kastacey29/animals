import java.util.Objects;

public class Birds extends Animals {
    private String livingEnvironment;

    public Birds(String name, int yearOfBirth, String livingEnvironment) {
        super(name, yearOfBirth);
        setLivingEnvironment(livingEnvironment);
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

    @Override
    protected void eat() {
        System.out.println("я ем ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return livingEnvironment.equals(birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    protected void go() {
        System.out.println("я люблю охотиться и ");
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
