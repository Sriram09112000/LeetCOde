import java.util.Arrays;
import java.util.Scanner;

public class sechighest {
    public  static  void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=scan.nextInt();
        System.out.println("Enter array elements");
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Elements are"+ Arrays.toString(array));
        int secondhighest=array[size-2];
        System.out.println(secondhighest);
    }
}
