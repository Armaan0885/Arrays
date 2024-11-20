import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("How many elements you want to insert in the array: ");
     int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
          System.out.print("Here are the elements: ");
          
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
            sc.close();
        }
    }
}
