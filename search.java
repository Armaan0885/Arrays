import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to insert in the array: ");
        int size = sc.nextInt();
        int []arr = new int[size];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Now enter the element you want to find out: ");
        int find = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if(find == arr[i]){
                System.out.print("The index position of the number is: "+i);
            }   
            sc.close();
        }
    }
}
