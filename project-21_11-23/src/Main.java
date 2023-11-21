import org.example.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

      /*  Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Hello world");
        map.put(1,"Welcome");
        map.put(2,"Hello world");
        System.out.println(map);*/

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
        System.out.println(s);

    }
}