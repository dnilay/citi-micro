import com.example.Customer;
import com.example.Employee;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Employee> set=new HashSet<Employee>();

        set.add(new Employee(100,"John Doe",12000));
        set.add(new Employee(101,"Mary Public",12000));

        //using iterator
        Iterator<Employee> i=set.iterator();
        while (i.hasNext())
        {
            Employee e=i.next();
            System.out.println(e);
        }

    }
}