import java.util.Scanner;
/*It applies ATM application using switch-case.*/

public class ATMWithSwitchCase {
    public static void main(String[] args) {
        int loginCounter = 3, choice;
        while (loginCounter > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Kullanıcıyı giriniz:  ");
            String user = scanner.nextLine();
            System.out.print("Parolayı giriniz: ");
            String password = scanner.nextLine();


            double balance = 1500;
            double withdraw;
            double deposit;

            if (user.equals("Melih") && password.equals("6161")) {
                System.out.println("Hoşgeldiniz");

                do {
                    System.out.println("1-Para cekmek icin\n" +
                                       "2-Para yatirmak icin\n" +
                                       "3-Bakiye sorgulama\n" +
                                       "4-Cikis");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1 -> {
                            System.out.println("Bakiyeniz:" + balance);
                            System.out.print("Ne kadar cekeceksiniz: ");
                            withdraw = scanner.nextFloat();
                            if (withdraw > balance) {
                                System.out.println("Yetersiz bakiye");
                            } else {
                                balance -= withdraw;
                            }
                        }
                        case 2 -> {
                            System.out.print("Ne kadar yatıracaksınız: ");
                            deposit = scanner.nextInt();
                            balance += deposit;
                            System.out.println("Yeni bakiyeniz" + balance);
                        }
                        case 3 -> System.out.println("Bakiyeniz:" + balance);
                        default -> System.out.println("Yanlış seçim yaptınız.");
                    }

                }
                while (choice != 4);

                    System.out.println("Tekrar görüşmek üzere.");
                    break;

            } else {
                loginCounter--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (loginCounter == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan Hakkınız : " + loginCounter);
                }
            }
        }
    }
}
