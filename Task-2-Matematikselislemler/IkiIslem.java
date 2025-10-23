public class IkiIslemSonucu {
    public static void main(String[] args) {
        // Pay ve payda hesaplamaları için double (ondalıklı sayı) değişkenler kullanılır.
        double pay = (9.5 * 4.5) - (2.5 * 3);
        double payda = 45.5 - 3.5;

        // Bölme işlemi
        double sonuc = pay / payda;

        // Sonucu 4 ondalık basamak hassasiyetinde formatlayarak yazdır.
        // %.4f formatı 4 ondalık basamak anlamına gelir.
        System.out.printf("Islem sonucu: %.4f%n", sonuc);
    }
}
