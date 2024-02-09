
public class Main{
    public  static void  main(String [] args){
//       sub array
        int [] arr = new int []{12,34,23,13,46};
//        int si = 0 ; // start index
//        int ei =arr.length-1; // end index
        for (int si =0 ;si<arr.length;si++){
            for(int ei =si ;ei < arr.length;ei++){
                for (int k =si ; k<= ei ;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println(" ");
            }

        }


    }
}
