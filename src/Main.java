import java.time.LocalDate;

public class Main {
    static void main() {
        Person juan = new Person("Juan", LocalDate.of(2004, 7, 17));
        System.out.println(juan);
    }
}
