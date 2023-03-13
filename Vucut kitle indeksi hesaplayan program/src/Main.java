import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, kilo,ans = 0;
        System.out.println("Boyunuzu metre cinsinden giriniz: ");
        height = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();
        ans = kilo / (height*height);
        System.out.println("Vücut Kitle İndeksiniz: " + ans);
    }
}