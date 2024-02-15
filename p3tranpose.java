
public class Main {
    public static void printName(String name) {

        System.out.println("Hi, I am " + name + "!");
    }
    public static void tranpose(int[][] arr) {
        ////       convert all columns into row
        for (int lsi = 1; lsi < arr.length; lsi++) { //lsi = left start index  //row
            for (int rsi = 0; rsi < lsi; rsi++) {  //rsi = right start index  // col
                int temp = arr[lsi][rsi];
                arr[lsi][rsi] = arr[rsi][lsi];
                arr[rsi][lsi] = temp;
//                System.out.print(arr[lsi][rsi]);
            }
//            System.out.println("");
        }
        ////        after convert
        System.out.println("after convert");
        for (int i = 0; i < arr.length; i++) {  //row
            for (int j = 0; j < arr[0].length; j++) { // col
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {2, 3, 4, 5},
                {5, 4, 3, 4},
                {9, 8, 7, 6},
                {2, 4, 8, 2}};
        String Name = "kabi ";
        printName(Name);
        tranpose(arr);

//        traversal
//        System.out.println("before convert");
//        for (int i = 0; i < arr.length; i++) {  //row
//            for (int j = 0; j < arr[0].length; j++) { // col
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println("");
//        }


    }
}


