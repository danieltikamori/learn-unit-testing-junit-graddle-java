import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {

    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(this.birthDate, LocalDate.now());
    }

}
