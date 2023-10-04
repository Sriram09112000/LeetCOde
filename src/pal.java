import java.util.Scanner;
public class pal {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int value=scan.nextInt();
        int r;
        int sum=0;
        int temp=value;
        while(value>0){
            r=value%10;
            sum=(sum*10)+r;
            value=value/10;


        }
        System.out.println(sum);
        if(temp==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("No");
        }


    }
}
