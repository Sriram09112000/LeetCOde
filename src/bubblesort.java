import java.util.Scanner;
import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=scan.nextInt();
        System.out.println("Enter the elements of an array");
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Elements are"+Arrays.toString(array));

        for (int i = 0; i <array.length; i++) {
            for(int j=0;j<array.length-i-1;j++) {
                if (array[j] > array[j+1]) {

                    int a = array[j];
                    array[j] = array[j+1];
                    array[j+1] = a;


                }

            }

        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}