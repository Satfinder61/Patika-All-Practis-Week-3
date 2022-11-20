import java.util.Scanner;
/*Write a program that calculates the average of numbers divisible by 3 and 4 from 0 to the number entered with Java loops.*/

public class CommonDivisibility {
    public static void main(String[] args) {

        double result = 0;
        int counter = 0;
        double average;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girdiğiniz sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması bulunacaktır: ");
        int enteredOne = scanner.nextInt();
        if(enteredOne < 0){
            System.out.println("0'dan küçük sayı giremezsiniz, lütfen tekrar deneyiniz.");
        }

        for(int i = 1; i <= enteredOne;i++){
            if(i % 3 == 0 && i % 4 == 0){
                result = result + i;
                counter++;

            }
        }
         average =  result / counter;
        if(result != 0 )
        System.out.println("Girdiğiniz sayının ortalaması: " + average);
        else
            System.out.println(enteredOne+ " sayısına kadar 3 ve 4'e tespit edilemedi!");



    }
}
