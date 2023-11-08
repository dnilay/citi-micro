import com.domain.Color;
import com.domain.Customer;
import com.domain.CustomerType;
import com.domain.Size;
import com.example.Shirt;

import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
      /*  Shirt shirt=new Shirt();
        shirt.createShirt(UUID.randomUUID().toString(), Color.BLUE, null);
        System.out.println(shirt.getShirtDetails());*/

        Customer customer=new Customer();
        customer.createCustomer(new Random().nextInt(),"John","Doe","john@email.com", CustomerType.REGULAR_CUSTOMER);
        System.out.println(customer.getDetails());
    }
}