package latihan_bu_aul;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan harga barang sebelum diskon:");
        double harga_awal = input.nextDouble();
        System.out.print("Masukkan persentase diskon (Cukup masukkan angka tanpa %):");
        float besaran_diskon = input.nextFloat();
        System.out.print("Masukkan jumlah barang yang dibeli:");
        int jumlah_barang = input.nextInt();

        double harga_total_setelah_diskon = (harga_awal - (harga_awal*(besaran_diskon/100))) * jumlah_barang;
        double harga_per_barang_setelah_diskon = harga_awal - (harga_awal*(besaran_diskon/100));
        System.out.println("Harga total setelah diskon adalah:" + " "  + harga_total_setelah_diskon);
        System.out.println("Harga per barang setelah diskon adalah:" + " " + harga_per_barang_setelah_diskon);

    }
}
