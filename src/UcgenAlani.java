import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        // Değişkenler
        int a,b,c;
        double u,Alan,cevre;

        // Kullanıcı Veri Girişi
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        a = girdi.nextInt();
        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        b = girdi.nextInt();
        System.out.print("3. Kenar Uzunluğunu Giriniz: ");
        c = girdi.nextInt();

        // Hesaplamalar
        u=(a+b+c)/2;
        cevre=2*u;
        Alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        // Çıktılar
        System.out.println("Üçgenin Çevresi: "+cevre);
        System.out.println("Üçgenin Alanı: "+Alan);

    }
}
