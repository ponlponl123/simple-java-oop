import java.util.Date;

public class Worker {
    public String id;
    public String firstName;
    public String lastName;
    public Date joinDate;
    public float salary;
    public String edu;
    public String gender;
    public String role;

    public Worker(String id, String firstName, String lastName, Date joinDate, String gender, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
        this.gender = gender;
        this.role = role;
    }
}
