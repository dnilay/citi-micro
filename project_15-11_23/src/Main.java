import com.example.Employee;
import com.example.factory.EmployeeFactory;

import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("initializing and creating employee array\n=================================\n");

       Employee[] arr= EmployeeFactory.initializeEmployees();

       for(Employee employee:arr)
       {
           System.out.println("Employee ID: "+employee.getEmployeeId()+" First Name: "+employee.getFirstName()+" Last Name: "+employee.getLastName()+" Email: "+employee.getEmail());
       }
       System.out.print("Enter Employee ID to search: ");
       int id=scanner.nextInt();
       Employee employee=EmployeeFactory.findEmployeeById(id);
       if(employee==null)
       {
           System.out.println("Employee Not Found with id: "+id);
       }
       else {
           System.out.println("Employee Found: \n"+"Employee ID: "+employee.getEmployeeId()+" First Name: "+employee.getFirstName()+" Last Name: "+employee.getLastName()+" Email: "+employee.getEmail());
       }
    }
}