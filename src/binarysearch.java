import java.util.Scanner;

public class binarysearch {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size ");
        int size=scan.nextInt();
        System.out.println("Enter array elements");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter target element");
        int target=scan.nextInt();
        int left=0;
        int right=size-1;
        int result=-1;
        while(left<=right){
            int mid=(left+right)/2;
            System.out.println("Current search range: [" + left + ", " + right + "]");
            System.out.println("Current middle index: " + mid);
            if(arr[mid]==target){
                result=mid;
                break;
            } else if (arr[mid]<target) {
                left=mid+1;

            }
            else{
                right=mid-1;
            }
        }
        if(result!=-1){
            System.out.println("The target element is found at index"+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
