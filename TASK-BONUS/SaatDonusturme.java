public class saatdonusturme {
    public static void main(String[] args) {
        // Örnek olarak 1 saat, 1 dakika, 5 saniye = 3665 saniye
        int toplamSaniye = 3665;
        int kalanSaniye = toplamSaniye;

        // Saat hesaplama (1 saat = 3600 saniye)
        int saat = kalanSaniye / 3600;
        kalanSaniye = kalanSaniye % 3600;

        // Dakika hesaplama (1 dakika = 60 saniye)
        int dakika = kalanSaniye / 60;
        kalanSaniye = kalanSaniye % 60;

        // Kalan saniye
        int saniye = kalanSaniye;

        System.out.println("---------------------------------");
        System.out.println(toplamSaniye + " Saniye Dönüşümü:");
        System.out.println("---------------------------------");
        // Çıktıyı 00:00:00 formatında hizalamak için printf kullanıyoruz
        System.out.printf("Süre: %02d:%02d:%02d%n", saat, dakika, saniye);
        System.out.println("---------------------------------");
    }
}
