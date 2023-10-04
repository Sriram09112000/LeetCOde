public class revarray {
    public static void main(String[] args){
        int[] array={1,2,3,4,5,6,9,13,11};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }

    }
}
