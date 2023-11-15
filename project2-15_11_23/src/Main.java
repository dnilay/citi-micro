import com.example.Employee;
import com.example.Manager;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager(100,"John Doe",10000,new Date(),"IT");
        System.out.println(manager.getDetails());
    }
}