public class vucutkitleendeksi {
    public static void main(String[] args) {
        // Örnek değerler
        double agirlik_kg = 75.0; // Kilogram
        double boy_metre = 1.75;  // Metre (175 cm)

        // VKİ Hesaplama: VKİ = Kilo / (Boy * Boy)
        double vki = agirlik_kg / (boy_metre * boy_metre);

        System.out.println("---------------------------------");
        System.out.println("VÜCUT KİTLE İNDEKSİ (VKİ)");
        System.out.println("---------------------------------");
        System.out.printf("Ağırlık: %.1f kg%n", agirlik_kg);
        System.out.printf("Boy    : %.2f m%n", boy_metre);
        System.out.printf("VKİ    : %.2f%n", vki);
        System.out.println("---------------------------------");

        // Bonus: VKİ kategorisi (Basit haliyle)
        if (vki < 18.5) {
            System.out.println("Durum  : Zayıf");
        } else if (vki < 25) {
            System.out.println("Durum  : Normal");
        } else {
            System.out.println("Durum  : Fazla Kilolu");
        }
        System.out.println("---------------------------------");
    }
}
