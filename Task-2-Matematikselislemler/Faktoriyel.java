public class Faktoriyel {
    public static void main(String[] args) {
        int sayi = 5;
        long faktoriyel = 1; // Çarpım büyük çıkabileceği için 'long' kullandık.
        String adimlar = "5! = ";

        System.out.println("5! hesaplaniyor...");

        // Faktöriyeli hesaplamak için döngü kullanılır
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i; // faktoriyel = faktoriyel * i

            // Ara adımları göstermek için string oluşturulur
            if (i > 1) {
                adimlar += " x ";
            }
            adimlar += i;
        }
        
        // Ara adımları ve son sonucu tersten yazdırmak için stringi ters çevirelim:
        // 5! = 5 x 4 x 3 x 2 x 1
        String terstenAdimlar = "5! = ";
        for (int i = sayi; i >= 1; i--) {
            terstenAdimlar += i;
            if (i > 1) {
                terstenAdimlar += " x ";
            }
        }

        System.out.println("Ara adimlar: " + terstenAdimlar);
        System.out.println("Nihai sonuc: " + faktoriyel);
    }
}
