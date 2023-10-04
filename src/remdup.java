import java.util.Arrays;
import java.util.Scanner;
public class remdup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scan.nextInt();
        System.out.println("Enter array elements");
        int[] array = new int[size];
        int i, j;
        for (i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Array elememts are" + Arrays.toString(array));
        for (i = 0; i < array.length; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j]=-1;


            }
        }


        }
            for( i=0;i<array.length;i++)
                if(array[i]!=-1){
                    System.out.print("\t"+array[i]);

                }
            }
    }

