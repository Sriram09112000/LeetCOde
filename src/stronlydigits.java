import java.util.Scanner;

public class stronlydigits {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.next();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<'0' || str.charAt(i)>'9'){
                System.out.println("The String not only contains digits");
                str=scan.next();
            }
            else{
                System.out.println("The String  only contains digits");
                str=scan.next();
            }
        }

    }
}
