import java.util.Scanner;
public class occurences {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.next();
        System.out.println("Enter a character");
        char search=scan.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==search){
                count++;
            }

        }
        System.out.println(count);



    }
}
