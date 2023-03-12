import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money;
        double VAT;

        System.out.print("Paranızı giriniz: ");
        money = input.nextDouble();

        VAT = (money > 1000)? 1.08 : 1.18;

        System.out.println("KDV'siz fiyat: " +money);
        money *= VAT;

        System.out.println("KDV'li fiyat: "+money);
        System.out .println("KDV: " +VAT);


    }
}