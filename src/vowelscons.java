import java.util.Scanner;

public class vowelscons {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scan.next();
        int vowels=0;
        int cons=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                vowels++;
            }
            else{
                cons++;
            }
        }
        System.out.println("The vowels are"+vowels);
        System.out.println("The consonants are"+cons);
    }
}
