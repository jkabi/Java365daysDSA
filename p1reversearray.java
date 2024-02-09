public class p1reversearray {
    public static void main(String [] args){
//    REVERSE ARRAY
        int [] arr = new int []{12,34,56,78,89};
        int temp;
        int i=0;
        int j =arr.length-1;
        while (i<j){
            temp = arr[i];
            arr[j] = arr[i];
            i++;
            j--;
        }
        for(int k =0 ;k<arr.length;k++){
            System.out.print(arr[k]+ " ");
        }
     }
}
