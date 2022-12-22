public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder name(String name) throws IllegalArgumentException {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Поле имя обязательно для заполнения");
        } else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder surname(String surname) throws IllegalArgumentException {
        if (surname.isEmpty()) {
            throw new IllegalArgumentException("Поле фамилия обязательно для заполнения");
        } else {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder age(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder city(String city) {
        this.city = city;
        return this;
    }

    public Person build() throws IllegalStateException {
        Person person;
        if (name == null) {
            throw new IllegalStateException("Поле имя обязательно для заполнения");
        }
        if (surname == null) {
            throw new IllegalStateException("Поле фамилия обязательно для заполнения");
        }
        if (age > 0) {
            person = new Person(name,surname,age);
        } else {
            person = new Person(name,surname);
        }
        person.setCity(city);
        return person;
    }


}
