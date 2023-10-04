import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        int r;
        int sum=0;
        int temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}
