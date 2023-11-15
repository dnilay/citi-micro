import com.example.Employee;
import com.example.Manager;
import com.example.Supervisor;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //ref of employee pointing to an object of derived call
        //dynamic method dispatching
       Employee employee=new Manager(100,"John Doe",10000,new Date(),"IT");
       System.out.println(employee.getDetails());

       employee=new Supervisor(101,"Mary Public",11000,new Date(),"John Doe");
       System.out.println(employee.getDetails());

    }
}