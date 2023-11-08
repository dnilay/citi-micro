public class Order {
    //attributes
    int orderId;
    String orderName;
    double orderValue;

     void createOrder()
    {
        System.out.println("order creating...");
        orderId=100;
        orderName="Laptop";
        orderValue=800;
        System.out.println("order created...");
    }

    String getDetails()
    {
        return "Order ID: "+orderId+" Order Name: "+orderName+" Order value: "+orderValue;
    }

}
