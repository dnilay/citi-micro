import com.example.Customer;
import com.example.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Set<Employee> set=new HashSet<Employee>();

        set.add(new Employee(100,"John Doe",12000));
        set.add(new Employee(101,"Mary Public",12000));

        //using iterator
        Iterator<Employee> i=set.iterator();
        while (i.hasNext())
        {
            Employee e=i.next();
            System.out.println(e);
        }
*/
        Set<Integer> set=new HashSet<Integer>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(100);
        System.out.println(set);
        List<Integer> list=new LinkedList<Integer>();
        list.add(100);
        list.add(2);
        list.add(300);
        list.add(100);
        System.out.println(list);
        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}