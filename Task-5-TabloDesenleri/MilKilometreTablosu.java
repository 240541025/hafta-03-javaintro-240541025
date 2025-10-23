public class Donusumtablosu {
    public static void main(String[] args) {
        final double MIL_TO_KM = 1.609; // Dönüşüm sabiti

        // Dönüştürülecek mil değerlerini içeren dizi
        int[] milDegerleri = {1, 5, 10, 20, 50};

        System.out.println("----- MIL - KILOMETRE DÖNÜŞÜMÜ -----");
        // Başlıklar
        System.out.printf("%-10s %15s%n", "Mil", "Kilometre");
        System.out.println("----------------------------------");

        // Mil değerleri üzerinde döngü
        for (int mil : milDegerleri) {
            double kilometre = mil * MIL_TO_KM;

            // Veri satırları: %-10d (10 karakter sola hizalı integer)
            // %15.3f (15 karakterde 3 ondalık basamaklı double, sağa hizalı)
            System.out.printf("%-10d %15.3f%n", mil, kilometre);
        }
        System.out.println("----------------------------------");
    }
}
