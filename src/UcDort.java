import java.util.Scanner;

public class UcDort {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        for (int i = 0; i < sayi; i++) {
            if (i%3==0 && i%4==0) {
                System.out.println(i);
            }
        }
    }
}
