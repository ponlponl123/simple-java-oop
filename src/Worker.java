import java.time.LocalDate;

public class Worker {
    public String id;
    public String firstName;
    public String lastName;
    public LocalDate joinDate;
    public float salary;
    public String edu;
    public String gender;
    public String role;

    public Worker(String id, String firstName, String lastName, LocalDate joinDate, float salary, String edu, String gender, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
        this.salary = salary;
        this.edu = edu;
        this.gender = gender;
        this.role = role;
    }
}
