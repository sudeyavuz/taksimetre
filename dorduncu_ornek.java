package JAVA101;
import java.util.Scanner;
public class dorduncu_ornek {
    public static void main(String[] args) {
        double e = 2.20 ,toplam ;
        int km , b = 10 ;
        Scanner input = new Scanner(System.in);
        System.out.println("gidilen km'yi giriniz");
        km = input.nextInt();
        toplam = km * e;
        toplam+=b;
        toplam = ( toplam < 20 ? 20 : toplam );
        System.out.println("tutar: "+toplam);
    }
}
