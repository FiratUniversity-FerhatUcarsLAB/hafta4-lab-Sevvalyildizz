/*
 * Ad Soyad: [ŞEVVAL YILDIZ]
 * Ogrenci No: [250541025]
 * Tarih: [05.11.2025]
 * Aciklama: Gorev 2 - Geometrik Hesaplayıcı
 * 
 * Bu program kullanıcıdan dairenin yarıçapını alır
 * ve daire ile küreye ait geometrik hesaplamaları yapar.
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        // Sabit tanimlama
        final double PI = 3.14159;

        // Scanner objesi olusturun
        Scanner input = new Scanner(System.in);

        // Degisken tanimlamalari
        double yaricap;
        double daireAlani, daireCevresi, daireCapi;
        double kureHacmi, kureYuzeyAlani;

        // Kullanıcıdan yarıçapı al
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        yaricap = input.nextDouble();

        // Hesaplamalar
        daireAlani = PI * Math.pow(yaricap, 2);
        daireCevresi = 2 * PI * yaricap;
        daireCapi = 2 * yaricap;
        kureHacmi = (4.0 / 3.0) * PI * Math.pow(yaricap, 3);
        kureYuzeyAlani = 4 * PI * Math.pow(yaricap, 2);

        // Sonuçlari ekrana yazdir
        System.out.println("\nSONUCLAR:");
        System.out.println("----------------------------");
        System.out.printf("Daire Alani       : %8.2f cm^2%n", daireAlani);
        System.out.printf("Daire Cevresi     : %8.2f cm%n", daireCevresi);
        System.out.printf("Daire Capi        : %8.2f cm%n", daireCapi);
        System.out.printf("Kure Hacmi        : %8.2f cm^3%n", kureHacmi);
        System.out.printf("Kure Yuzey Alani  : %8.2f cm^2%n", kureYuzeyAlani);

        // Scanner'i kapatin
        input.close();
    }
}

