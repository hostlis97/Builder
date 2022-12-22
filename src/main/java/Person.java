public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public String getCity() {
        return city;
    }

    public boolean hasAddress() {
        return city != null;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().surname(surname).city(city);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
