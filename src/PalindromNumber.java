import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        System.out.println(" Please insert the number");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int numberr= number;
        int ReversNumber = 0;
        if (number < 0) {
            number *= -1;
        }
        while (numberr != 0) {
            int n1 = numberr % 10;
            numberr /= 10;
            ReversNumber = n1 + ReversNumber * 10;
        }
        if (number == ReversNumber) {
            System.out.println("The number is palindrom");
        } else {
            System.out.println("the number isn`t palidrom ");
        }
    }
}
