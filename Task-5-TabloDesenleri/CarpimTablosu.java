public class Carpimtablosu {
    public static void main(String[] args) {
        int carpan = 2;

        System.out.println("----- 2'NİN ÇARPIM TABLOSU -----");

        // 1'den 10'a kadar döngü
        for (int i = 1; i <= 10; i++) {
            int sonuc = carpan * i;

            // Çıktı formatı: 2 x 1 = 2
            // %d (integer değeri), %2d (minimum 2 karakterde integer)
            System.out.printf("%d x %2d = %2d%n", carpan, i, sonuc);
        }
        System.out.println("--------------------------------");
    }
}
