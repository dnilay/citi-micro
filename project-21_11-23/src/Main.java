import org.example.Employee;
import org.example.factory.EmployeeFactory;

import java.util.*;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        EmployeeFactory employeeFactory=new EmployeeFactory();
      /*  Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Hello world");
        map.put(1,"Welcome");
        map.put(2,"Hello world");
        System.out.println(map);*/
/*
        Map<Integer, Employee> map=new HashMap<Integer,Employee>();
        map.put(new Random().nextInt(10000),new Employee(1,"Jogh doe",10000));
        map.put(new Random().nextInt(10000),new Employee(2,"Mary Public",13000));

        Set<Integer> set=map.keySet();
        System.out.println(set);
        Collection<Employee> collection=map.values();
        Iterator<Employee> iterator= collection.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        Set s=map.entrySet();
        System.out.println(s);*/
        int choice=0;
        do{

            System.out.println("1. Create Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Find Employee By Id");
            System.out.println("0. Exit");
            System.out.print("Enter Your Choice: ");
            choice=scanner.nextInt();

            switch (choice)
            {
                case 1:
                    employeeFactory.createEmployee();
                    break;
                case 2:
                    employeeFactory.listEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    employeeFactory.getEmployeeById(scanner.nextInt());
                    break;
                case 0:
                    System.out.println("bye.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }

        }while (choice!=0);




    }
}