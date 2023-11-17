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
        Integer b=a;
        //auto unboxing
        int result=b;
        char c='a';
        Character c1=new Character('z');

        set.add(10);
        set.add("abcd");
        set.add(new Date());
        set.add(10);
        set.add(100);
        //using iterator
        Iterator i=set.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        //using enhanched for loop
        for(Object o:set)
        {
            System.out.println(o);
        }
    }
}