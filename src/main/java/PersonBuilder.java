public class PersonBuilder {
    public String name;
    public String surname;
    public int age = -10;
    public String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("недопустимое значение возраста");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name != null && surname != null && age != -10) {
            return new Person(name, surname, age);
        }
        if (name != null && surname != null && age == -10) {
            return new Person(name, surname);
        }
        throw new IllegalStateException("недостаточно указанных прараметров");
    }
}