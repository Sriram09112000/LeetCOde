import java.util.Scanner;

public class fibo {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter count");
        int n= scan.nextInt();
        int n1=0,n2=1;
        System.out.println(n1);
        System.out.println(n2);
        int n3;
        for(int i=2;i<n;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }

    }
}
