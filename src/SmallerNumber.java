import java.util.Scanner;

public class SmallerNumber {
    public static void main(String[] args) {
        Scanner insertnumber= new Scanner(System.in);
        System.out.println(" Insert the length of array");
        int n=insertnumber.nextInt() ;
        System.out.println(" Insert a array of "+ n + " number");
        int[] myArray = new int[n];
       for( int a=0; a < myArray.length; a++ ){
           System.out.println("Please insert the number from position " + a);
           int number= insertnumber.nextInt();
           myArray[a]= number;
       }
       // System.out.println(Arrays.toString(myArray));
       int min= myArray[0];
        for (int i = 1; i <= myArray.length; i++) {
            if (min > myArray[i])
            {
                min = myArray[i];
            }
        }
        System.out.println(min);
    }
}