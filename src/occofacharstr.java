import java.util.Scanner;

public class occofacharstr {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=scan.nextLine();

        for(int i=0;i<str.length();i++) {
            int count=1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }



            }
            System.out.println(str.charAt(i)+"has occurred"+count+"times");

        }

    }
}
