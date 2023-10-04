import java.util.Arrays;
import java.util.Scanner;

public class revarray1 {
    public  static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = scan.nextInt();
        System.out.println("Enter array Elements");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();


        }
        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + "\t");

        }

    }}