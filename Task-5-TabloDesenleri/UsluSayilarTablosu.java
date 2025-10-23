public class UslusayilarTablosu {
    public static void main(String[] args) {
        System.out.println("----- ÜSLÜ SAYILAR TABLOSU -----");
        // Başlıklar: %-5s (5 karakter sola hizalı String)
        System.out.printf("%-5s %-5s %-5s%n", "a", "a^2", "a^3");
        System.out.println("--------------------------------");

        // 1'den 5'e kadar döngü
        for (int a = 1; a <= 5; a++) {
            // a^2 ve a^3 hesaplamaları (Math.pow() double döndürür, int'e çevirilir)
            int aKare = a * a;
            int aKup = a * a * a;

            // Veri satırları: %-5d (5 karakter sola hizalı integer)
            System.out.printf("%-5d %-5d %-5d%n", a, aKare, aKup);
        }
        System.out.println("--------------------------------");
    }
}
