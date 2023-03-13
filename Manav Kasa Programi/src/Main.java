import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ak,ek,dk,mk,pk;
        double a = 2.14, e = 3.67, d = 1.11, m = 0.95, p = 5.00;
        double product = 0;
        System.out.print("Armut kaç kilo? : ");
        ak = input.nextInt();
        System.out.print("Elma kaç kilo? : ");
        ek = input.nextInt();
        System.out.print("Domates kaç kilo? : ");
        dk = input.nextInt();
        System.out.print("Muz kaç kilo? : ");
        mk = input.nextInt();
        System.out.print("Patlıcan kaç kilo? : ");
        pk = input.nextInt();
        product = (a*ak)+(e*ek)+(d*dk)+(m*mk)+(p*pk);
        System.out.println("Toplam tutar : " + product);
    }
}