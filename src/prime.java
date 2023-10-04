import java.util.Scanner;

public class prime {
    public static void main(String[] aergs){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        int m,flag=0;
        m=n/2;
        if(n==0 || n==1){
            System.out.println("Not a prime number");
        }
        else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println("Not a prime number");
                    flag=1;
                }
            }
        }
        if(flag==0){
            System.out.println(n+"is a prime number");
        }
    }
}
