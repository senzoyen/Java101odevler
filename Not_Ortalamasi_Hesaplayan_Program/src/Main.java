import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math,phy,chem,turk,history,music,product = 0;
        String pass;

        System.out.println("Matematik puanınızı girin: ");
        math = input.nextInt();

        System.out.println("Fizik puanınızı girin: ");
        phy = input.nextInt();

        System.out.println("Kimya puanınızı girin: ");
        chem = input.nextInt();

        System.out.println("Türkçe puanınızı girin: ");
        turk = input.nextInt();

        System.out.println("Tarih puanınızı girin: ");
        history = input.nextInt();

        System.out.println("Müzik puanınızı girin: ");
        music = input.nextInt();

        product += math+phy+chem+turk+history+music;
        product /= 6;

        System.out.println("Not ortalamanız: " + product);

        pass = (product >= 60)?"Geçti":"Kaldı";

        System.out.println(pass);
    }
}