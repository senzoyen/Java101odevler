import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, a;
        //double area = 0, cir = 0;
        double pi = 3.14;
        double area = 0;
        System.out.println("Yarıçap girin: ");
        r = input.nextInt();
        System.out.println("Merkez açı ölçüsü girin: ");
        a = input.nextInt();
        //area = (pi*r*r);
        //cir = (2*pi*r);
        //System.out.println("Alan: " + area);
        //System.out.print("Çevre: " + cir);
        area += (pi * (r*r) * a) / 360;
        System.out.print("Alan: " + area);

    }
}