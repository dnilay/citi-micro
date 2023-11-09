import com.example.domain.Order;

import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Order order=new Order(new Random().nextInt(),new Date(),"Laptop");
        System.out.println(order.displayDetails());

    }
}