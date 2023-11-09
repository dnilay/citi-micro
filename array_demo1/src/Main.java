import java.util.Arrays;
import java.util.Scanner;

public class Main {


private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args)

    {
        int l=0;
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

    }
}