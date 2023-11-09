import java.util.Arrays;
import java.util.Scanner;

public class Main {


private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args)

    {

        /*int l=0;
        int arr[];
        System.out.print("enter the length of array: ");
        l=scanner.nextInt();
        arr=new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.print("enter value for arr["+i+"]");
            arr[i]=scanner.nextInt();
        }
        System.out.println("printing array elements:\n");
        for(int i=0;i<arr.length;i++)
        {

            System.out.print("\t"+arr[i]);
        }

        System.out.println("\nprinting Greatest element:\n");

        int max=Arrays.stream(arr).max().getAsInt();
        System.out.println("Max Element is: "+max);
        System.out.println("\nprinting Smallest element:\n");

        int min=Arrays.stream(arr).min().getAsInt();
        System.out.println("Min Element is: "+min);
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--)
        {

            System.out.print("\t"+arr[i]);
        }
*/
        Employee[] employees;
        employees=new Employee[5];
        employees[0]=new Employee(1,"John","Doe","john@email.com");
        employees[1]=new Employee(2,"Mary","Public","mary@email.com");
        employees[2]=new Employee(3,"Shane","Warne","shane@email.com");
        employees[3]=new Employee(4,"Jonthy","Roads","jonthy@email.com");
        employees[4]=new Employee(5,"Sachin","Tendulkar","sachin@email.com");
        //enhanched for loop
        for(Employee e:employees)
        {
            System.out.println(e.getDetails());
        }
    }
}
