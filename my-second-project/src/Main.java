import com.domain.Color;
import com.domain.Size;
import com.example.Shirt;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Shirt shirt=new Shirt();
        shirt.createShirt(UUID.randomUUID().toString(), Color.BLUE, null);
        System.out.println(shirt.getShirtDetails());
    }
}