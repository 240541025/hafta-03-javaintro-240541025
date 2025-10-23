public class DikdortgenHesaplama {
    public static void main(String[] args) {
        // Kenar uzunluklarını tanımla
        double en = 4.5;
        double boy = 7.9;

        // Alan hesaplama: Alan = En * Boy
        double alan = en * boy;

        // Çevre hesaplama: Çevre = 2 * (En + Boy)
        double cevre = 2 * (en + boy);

        // Sonuçları yazdır
        System.out.println("En: " + en + ", Boy: " + boy);
        System.out.printf("Dikdortgenin Alani: %.2f%n", alan);
        System.out.printf("Dikdortgenin Cevresi: %.2f%n", cevre);
    }
}
