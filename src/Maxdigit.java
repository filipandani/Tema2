import java.util.Scanner;

public class Maxdigit {
    public static void main(String[] args) {
        System.out.println(" Please insert the number");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int max = 0;
if ( number <0) number *= -1;
        while (number != 0) {
            int n1 = number % 10;
            if (max < n1) {
                max = n1;
            }
            number /= 10;
        }
        System.out.println(max);


}
      }
