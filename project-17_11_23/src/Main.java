import com.example.Customer;
import com.example.Employee;
import com.example.repo.EmployeeRepository;
import com.example.repo.EmployeeRepositoryImpl;

import java.util.*;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        EmployeeRepository employeeRepository=new EmployeeRepositoryImpl();
        int choice=0;
        String name=null;
        double salary=0;
        do {
            System.out.println("1. Create an Employee.");
            System.out.println("2. Dsisplay All Employees.");
            System.out.println("0. Exit.");
            System.out.print("Enter your choice: ");
            choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    name=scanner.next();
                    System.out.print("Enter Employee Salary: ");
                    salary=scanner.nextDouble();
                    employeeRepository.createEmployee(new Employee(new Random().nextInt(1000),name,salary));
                    break;
                case 2:
                       List<Employee> list=employeeRepository.getAllEmployees();

                       if(list.isEmpty())
                       {
                           System.out.println(" no employee(s) available try after some time.");
                       }
                       else
                       {
                           for(Employee e:list)
                           {
                               System.out.println(e);
                           }
                       }
                       break;
                case 0:
                    System.out.println("Bye.");
                    System.exit(0);
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }while (choice !=0);


    }
}