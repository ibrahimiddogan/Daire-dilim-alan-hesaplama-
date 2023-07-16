import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        int r,a;
        double pi =3.14;
        Scanner alici = new Scanner(System.in);
        System.out.print("Yarı çapı giriniz : ");
        r = alici.nextInt();
        System.out.print("a yı giriniz : ");
        a = alici.nextInt();
        double dairedilimalan;
        dairedilimalan = (pi*(r*r)*a)/360;
        System.out.println("Daire dilim alanı : "+ dairedilimalan);
    }
}
