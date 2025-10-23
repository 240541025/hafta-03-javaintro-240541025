public class DaireHesaplama {
    public static void main(String[] args) {
        // Yarıçapı tanımla
        double yaricap = 5.5;

        // Alan hesaplama: A = π * r * r
        double alan = Math.PI * yaricap * yaricap;

        // Çevre hesaplama: C = 2 * π * r
        double cevre = 2 * Math.PI * yaricap;

        // Sonuçları yazdır
        System.out.println("Yaricap: " + yaricap);
        System.out.printf("Dairenin Alani: %.4f%n", alan);
        System.out.printf("Dairenin Cevresi: %.4f%n", cevre);
    }
}
