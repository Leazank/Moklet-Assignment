package Latihan_UKL_Bu_Aul;

import java.util.Scanner;

public class soalPaket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Hitung Harga Paket ===");
        System.out.println("Masukkan jarak dalam Km");
        float jarak = in.nextFloat();
        System.out.println("Masukkan panjang dalam cm");
        double panjang = in.nextDouble();
        System.out.println("Masukkan lebar dalam cm");
        double lebar = in.nextDouble();
        System.out.println("Masukkan tinggi dalam cm");
        double tinggi = in.nextDouble();
        System.out.println("Masukkan berat dalam Kg");
        double berat = in.nextDouble();
        
        double volume = panjang*lebar*tinggi;
        
        double hargaPerKg;
        if (jarak<=10) {
            hargaPerKg = 4250;
        } else {
            hargaPerKg = 6000;
        }
        double hargaTotal = hargaPerKg*berat;

        if (volume>100) {
            hargaTotal += 50000;
    }   
    System.out.println("Harga Total adalah " + hargaTotal);
}
}
