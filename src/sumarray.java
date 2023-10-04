import java.util.Scanner;

public class sumarray {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scan.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elements in an array");
        int sum=0;
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
            sum=sum+array[i];

        }
        System.out.println("The sum is"+" "+ sum);
    }
}
