import java.util.Arrays;
import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args){
        int temp;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=scan.nextInt();
        System.out.println("Enter the elements of an array");
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Elements are"+ Arrays.toString(array));
        for(int i=1;i<size;i++) {
            temp = array[i];
            int j;
            for ( j = i - 1; j >= 0 && array[j] > temp; j--)
                array[j + 1] = array[j];
            array[j + 1] = temp;

        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+"");
        }
    }
}
