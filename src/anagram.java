import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string1");
        String str1=scan.next();
        System.out.println("Enter a string2");
        String str2=scan.next();
        boolean anagramornot=true;
        if(str1.length()==str2.length()){
            char[] anagram1=str1.toCharArray();
            char[] anagram2=str2.toCharArray();
            Arrays.sort(anagram1);
            Arrays.sort(anagram2);
            anagramornot=Arrays.equals(anagram1,anagram2);

        }
        else{
            System.out.println("Not Anagrams");
        }
        if(anagramornot==true){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not");
        }


    }
}
