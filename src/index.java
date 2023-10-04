import java.util.Arrays;
import java.util.Scanner;

public class index{
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String str1=scan.nextLine();

        for(int i=0;i<str1.length();i++){
            System.out.println("At index"+"\t"+i+"\t The character is \t"+str1.charAt(i));
        }
    }
}
