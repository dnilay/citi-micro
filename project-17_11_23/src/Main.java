import com.example.Customer;
import com.example.Employee;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set set=new HashSet();
        //primitive type
        int a=1;
        //wrapper type
        //auto boxing
        Integer b= a;
        //auto unboxing
        int result=b;
        char c='a';
        Character c1=new Character('z');
        set.add(new Customer());
        set.add(10);
        set.add("abcd");
        set.add(new Date());
        set.add(10);
        set.add(100);
        set.add(new Employee(100,"John Doe",12000));
        //using iterator
        Iterator i=set.iterator();
        while (i.hasNext())
        {
            Object o=i.next();
            if(o instanceof Integer)
            {
                int x=(Integer)o;
                System.out.println(x);
            } else if (o instanceof Character) {
                char ch=(Character)o;
                System.out.println(ch);
            }
            else if (o instanceof Date)
            {
                Date d=(Date) o;
                System.out.println(d);
            }
            else if(o instanceof Employee)
            {
                Employee e=(Employee) o;
                System.out.println(e);
            } else if (o instanceof String) {
                String s=(String) o;
                System.out.println(s);

            } else
            {
                System.out.println("can not determine the type");
            }
        }

    }
}