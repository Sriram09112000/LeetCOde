import java.util.Scanner;

public class removedupstr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        String result = removechar(str);
        System.out.println(result);
    }
    public static String removechar(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char currentchar=str.charAt(i);
            boolean duplicate=false;
            for(int j=0;j<sb.length();j++){
                if(sb.charAt(j)==currentchar){
                    duplicate=true;
                    break;
                }
            }
            if(duplicate==false){
                sb.append(currentchar);
            }
        }
        return sb.toString();

        }

    }

