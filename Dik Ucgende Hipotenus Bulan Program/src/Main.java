import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        int triArea = 0, triPerimeter = 0;
        int u = 0;
        //double c = 0;
        System.out.println("Üçgenin 1. köşesini giriniz: ");
        a = input.nextInt();
        System.out.println("Üçgenin 2. köşesini giriniz: ");
        b = input.nextInt();
        System.out.println("Üçgenin 3. köşesini giriniz: ");
        c = input.nextInt();
        //c = Math.sqrt((a*a) + (b*b));
        //System.out.println("Üçgenin Hipotenüsü: " + c);
        u = (a+b+c)/2;
        triPerimeter += 2*u;
        triArea += Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin çevresi: "+ triPerimeter);
        System.out.println("Üçgenin alanı: "+ triArea);
    }
}