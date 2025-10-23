public class ToplamaSerisi {
    public static void main(String[] args) {
        // Doğrudan toplama işlemi
        int toplam = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;

        // Sonucu yazdır
        System.out.println("1 + 2 + ... + 9 toplaminin sonucu: " + toplam);

        // Not: Alternatif olarak (daha gelişmiş), döngü de kullanılabilirdi:
        /*
        int toplamLoop = 0;
        for (int i = 1; i <= 9; i++) {
            toplamLoop += i;
        }
        System.out.println("Toplam: " + toplamLoop);
        */
    }
}
