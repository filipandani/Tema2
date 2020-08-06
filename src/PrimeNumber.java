import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(" Please insert the number");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
            if (number <= 0) {
                System.out.println("Please insert a natural number");
            } else {
                int firstnumberprime = 4;
                switch (number) {
                    case 1 -> System.out.println("Please insert a number greater than 1");
                    case 2 -> System.out.println("1");
                    case 3 -> System.out.println("1 and 2");
                    default -> {
                        System.out.println("1");
                        System.out.println("2");
                        System.out.println("3");
                        while (firstnumberprime < number) {
                            if (CheckNumber(firstnumberprime)) {
                                System.out.println(firstnumberprime + " ");
                            }
                            firstnumberprime++;
                        }
                    }
                }
            }
        }
        public static boolean CheckNumber ( int numbercheck){
            boolean check = true;
            for (int i = 2; i <= numbercheck / 2; i++) {
                if (numbercheck % i == 0) {
                    check = false;
                    break;
                }
            }
            return check;
        }
    }
