import java.util.Scanner;
/*Write a program that prints powers of 4 and 5 up to the number entered with Java loops.*/
public class FourAndFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz: ");
        int enteredNumber = scanner.nextInt();
        System.out.println("------------------");
        for(int i = 1; i < enteredNumber; i= i*4){
            System.out.println(i);
        }
        System.out.println("------------------");
        for(int i = 1; i < enteredNumber; i= i*5){
            System.out.println(i);
        }


    }
}
