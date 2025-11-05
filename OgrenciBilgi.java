/*
 * Ad Soyad: [ŞEVVAL YILDIZ]
 * Ogrenci No: [250541025]
 * Tarih: [05.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        final double BASARI_SINIRI = 2.00; // Sabit değer (final)

        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        System.out.print("Adinizi girin: ");
        String ad = input.nextLine();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.nextLine();

        System.out.print("Ogrenci numaraniz: ");
        int ogrenciNo = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrenciNo);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);

        if (gpa >= BASARI_SINIRI) {
            System.out.println("Durum: Basarili Ogrenci");
        } else {
            System.out.println("Durum: Basarisiz Ogrenci");
        }

        input.close();
    }
}



