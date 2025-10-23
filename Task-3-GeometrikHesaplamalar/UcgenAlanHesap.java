public class UcgenHeron {
    public static void main(String[] args) {
        // Kenar uzunluklarını tanımla
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        // 1. Yarı Çevre (s) hesaplama: s = (a + b + c) / 2
        double s = (a + b + c) / 2;

        // 2. Alan hesaplama: A = sqrt(s * (s - a) * (s - b) * (s - c))
        // Math.sqrt() karekök almak için kullanılır.
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Sonuçları yazdır
        System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Yari Cevre (s): " + s);
        System.out.printf("Ucgenin Alani: %.2f%n", alan);
    }
}
