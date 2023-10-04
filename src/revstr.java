import java.util.Scanner;
public class revstr {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scan.next();
        String rev=" ";
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;

        }
        System.out.println(rev);

    }
}
