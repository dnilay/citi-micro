public class Employee {


    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;

    public Employee() {
    }

    public Employee(int employeeId, String firstName, String lastName, String email) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getDetails()
    {
        return "Employee ID: "+employeeId+" First Name: "+firstName+" Last Name: "+lastName+" email: "+email;
    }
}
