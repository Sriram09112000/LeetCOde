import java.util.Scanner;

public class removeallcharactersexceptalpha {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();
        str=str.replaceAll("[^a-zA-z]","");

        System.out.println(str);
    }
}
