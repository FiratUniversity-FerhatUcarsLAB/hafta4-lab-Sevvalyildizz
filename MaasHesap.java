/*
 * Ad Soyad: [ŞEVVAL YILDIZ]
 * Ogrenci No: [250541025]
 * Tarih: [05.11.2025]
 * Aciklama: Gorev 3 - Maas Hesaplama Sistemi
 * 
 * Bu program calisan bilgilerini alir ve
 * detayli bir maas bordrosu olusturur.
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        // Sabit oranlar
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Scanner objesi
        Scanner input = new Scanner(System.in);

        // Degisken tanimlamalari
        String adSoyad;
        double brutMaas, mesaiUcreti, toplamGelir, toplamKesinti, netMaas;
        double sgkKesinti, gelirVergisi, damgaVergisi;
        double kesintiOrani, saatlikNetKazanc, gunlukNetKazanc;
        int haftalikSaat, mesaiSaat;

        // Bilgileri al
        System.out.println("====================================");
        System.out.println("        MAAS HESAPLAMA SISTEMI      ");
        System.out.println("====================================");

        System.out.print("Calisan adi soyadi: ");
        adSoyad = input.nextLine();  // nextLine() kullanarak tam ad alıyoruz

        System.out.print("Aylik brut maas (TL): ");
        brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        haftalikSaat = input.nextInt();

        System.out.print("Mesai saati: ");
        mesaiSaat = input.nextInt();

        // Hesaplamalar
        mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        toplamGelir = brutMaas + mesaiUcreti;

        sgkKesinti = toplamGelir * SGK_ORANI;
        gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;

        toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;
        netMaas = toplamGelir - toplamKesinti;

        kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        saatlikNetKazanc = netMaas / 176;
        gunlukNetKazanc = netMaas / 22;

        // Bordro çıktısı
        System.out.println("\n====================================");
        System.out.println("             MAAS BORDROSU           ");
        System.out.println("====================================");
        System.out.printf("Calisan: %s%n%n", adSoyad);

        System.out.println("GELIRLER:");
        System.out.printf("Brut Maas              : %10.2f TL%n", brutMaas);
        System.out.printf("Mesai Ucreti (%d saat)  : %10.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.println("------------------------------------");
        System.out.printf("TOPLAM GELIR           : %10.2f TL%n%n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%)   : %10.2f TL%n", SGK_ORANI * 100, sgkKesinti);
        System.out.printf("Gelir Vergisi (%.1f%%)  : %10.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%)  : %10.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("------------------------------------");
        System.out.printf("TOPLAM KESINTI         : %10.2f TL%n", toplamKesinti);
        System.out.printf("NET MAAS               : %10.2f TL%n", netMaas);

        System.out.println("\nEK ISTATISTIKLER:");
        System.out.printf("Kesinti Orani          : %6.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc     : %10.2f TL%n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc      : %10.2f TL%n", gunlukNetKazanc);

        System.out.println("====================================");

        // Scanner'i kapat
        input.close();
    }
}

