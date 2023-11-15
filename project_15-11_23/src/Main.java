import com.example.Employee;
import com.example.factory.EmployeeFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("initializing and creating employee array\n=================================\n");

       Employee[] arr= EmployeeFactory.initializeEmployees();

       for(Employee employee:arr)
       {
           System.out.println("Employee ID: "+employee.getEmployeeId()+" First Name: "+employee.getFirstName()+" Last Name: "+employee.getLastName()+" Email: "+employee.getEmail());
       }
    }
}