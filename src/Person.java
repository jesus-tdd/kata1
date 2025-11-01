import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String name() {
        return name;
    }

    public LocalDate birthday() {
        return birthday;
    }

    private int age() {
        return toYears(LocalDate.now().toEpochDay()-birthday.toEpochDay());
    }

    private int toYears(long days) {
        return (int) days/365;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age() +
                '}';
    }
}
