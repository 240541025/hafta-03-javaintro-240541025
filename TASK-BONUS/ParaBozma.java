    public static void main(String[] args) {
        // Bozulacak toplam para miktarı (örnek olarak 98 TL)
        int toplamPara = 98;
        int kalan = toplamPara;

        System.out.println("---------------------------------");
        System.out.println(toplamPara + " TL Para Bozumu:");
        System.out.println("---------------------------------");

        // 50 TL banknot hesaplama
        int elliTL = kalan / 50;
        kalan = kalan % 50;
        System.out.println("50 TL banknot: " + elliTL + " adet");

        // 20 TL banknot hesaplama
        int yirmiTL = kalan / 20;
        kalan = kalan % 20;
        System.out.println("20 TL banknot: " + yirmiTL + " adet");

        // 10 TL banknot hesaplama
        int onTL = kalan / 10;
        kalan = kalan % 10;
        System.out.println("10 TL banknot: " + onTL + " adet");

        // 5 TL banknot hesaplama
        int besTL = kalan / 5;
        kalan = kalan % 5;
        System.out.println(" 5 TL banknot: " + besTL + " adet");

        // 1 TL madeni para (kalan)
        int birTL = kalan;
        System.out.println(" 1 TL madeni: " + birTL + " adet");
        System.out.println("---------------------------------");
    }
}
