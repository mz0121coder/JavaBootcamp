import java.time.LocalDate;
import java.time.format.*;;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source) {
        this.name = source.getName();
        this.phoneNumber = source.getPhoneNumber();
        this.birthDate = source.getBirthDate();
        this.age = toAge(source.getBirthDate());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int toAge(String birthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(birthDate, formatter);

        // Calculate age based on birth date
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - date.getYear();

        // Check if the birthday has passed this year
        if (currentDate.getDayOfYear() < date.getDayOfYear()) {
            age--;
        }

        return age;
    }

}
