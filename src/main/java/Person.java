import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -10;
    protected String city;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void happyBirthday() {
        age++;
    }

    public boolean hasAge() {
        return age != -10;
    }

    public boolean hasAddress() {
        return !Objects.equals(city, "");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String address) {
        this.city = address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(city).setAge(0);
    }

    @Override
    public String toString() {
        return name;
    }
}
