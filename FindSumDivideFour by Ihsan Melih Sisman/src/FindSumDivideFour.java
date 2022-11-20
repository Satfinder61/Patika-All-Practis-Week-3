import java.util.Scanner;

/*
With Java loops, we write a program that accepts input from the user until a single number is entered and adds even and multiples
 of 4 from the entered values and prints it on the screen.
 */
public class FindSumDivideFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int enteredNumber;

        do {
            System.out.print("Sayıyı giriniz: ");
            enteredNumber = scanner.nextInt();
            if (enteredNumber % 4 == 0)
                sum = sum + enteredNumber;

        } while (enteredNumber % 2 == 0);
        System.out.println("Toplam: " + sum);


    }
}
