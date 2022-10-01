import java.util.Objects;

public abstract class Animals {
    private String name;
    private final int yearOfBirth;

    public Animals(String name, int yearOfBirth) {
        setName(name);
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;

        }
    }

    protected abstract void eat();

    private final void sleep() {
        System.out.println("я сплю!");
    }

    protected abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "не известно";
        } else {

            this.name = name;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return yearOfBirth == animals.yearOfBirth && name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
