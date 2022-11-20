import java.util.Scanner;
/*Use the "For Loop" program that calculates exponential numbers with the values entered by the user in Java.*/
public class FindTheExponentialNumber {
    public static void main(String[] args) {

        int sum = 1; // It can not be 0, if it were, the result would be 0.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int enteredNumber = scanner.nextInt();
        System.out.print("Üssü olacak sayıyı giriniz: ");
        int exponent = scanner.nextInt();


        for(int i = 1; i<= exponent;i++){
        sum = sum * enteredNumber;
        }
        System.out.println("Sonuç: " + sum);






    }
}
