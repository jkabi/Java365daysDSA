public class p4rotate90degree {
     public static void rotate( int[][] arr){

//       step1:  transpose array
         for (int lsi =1;lsi< arr.length;lsi++){
             for (int rsi = 0;rsi<lsi;rsi++){
                 int temp = arr[lsi][rsi];
                 arr[lsi][rsi] = arr[rsi][lsi];
                 arr[rsi][lsi] = temp;
             }
         }
//         step2:  swap array

         for (int si =0 ;si<arr.length;si++){
             int ei = arr.length-1;
             for (int tsi =0 ;tsi<ei;tsi++,ei-- ){
                 int temparr = arr[si][tsi];
                 arr[si][tsi] = arr[si][ei];
                 arr[si][ei] = temparr;

             }
         }



//         step 3 : traverse
         for(int i =0 ;i< arr.length;i++){
             for (int j =0 ; j<arr[0].length;j++){
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
     }



    public static void main (String[] args){
      int [][] arr = new int[][]{
              {1,2,3,4},
              {5,7,8,9},
              {0,5,4,3},
              {2,7,2,8}
      };
        rotate(arr);
    }
}