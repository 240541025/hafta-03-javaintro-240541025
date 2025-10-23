public class HesapOzeti {
    public static void main(String[] args) {
        // Alışveriş Listesi
        String urun1 = "Defter";
        int miktar1 = 2;
        double fiyat1 = 15.50;

        String urun2 = "Kalem";
        int miktar2 = 5;
        double fiyat2 = 4.99;
        
        String urun3 = "Silgi";
        int miktar3 = 1;
        double fiyat3 = 7.25;

        double toplamFiyat = (miktar1 * fiyat1) + (miktar2 * fiyat2) + (miktar3 * fiyat3);

        System.out.println("-------------- HESAP ÖZETİ --------------");
        // Başlık satırı: %-15s (15 karakter sola hizalı String)
        // %8s (8 karakter sağa hizalı String)
        // %10s (10 karakter sağa hizalı String)
        System.out.printf("%-15s %8s %10s%n", "ÜRÜN", "MİKTAR", "BİRİM FİYAT");
        System.out.println("-----------------------------------------");
        
        // Veri satırları
        // %.2f (2 ondalık basamaklı, sağa hizalı float/double)
        System.out.printf("%-15s %8d %10.2f TL%n", urun1, miktar1, fiyat1);
        System.out.printf("%-15s %8d %10.2f TL%n", urun2, miktar2, fiyat2);
        System.out.printf("%-15s %8d %10.2f TL%n", urun3, miktar3, fiyat3);
        
        System.out.println("-----------------------------------------");
        // Toplam Fiyat
        System.out.printf("%-15s %8s %10.2f TL%n", "TOPLAM TUTAR", "", toplamFiyat);
    }
}
