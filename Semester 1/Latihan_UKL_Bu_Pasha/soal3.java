package Latihan_UKL_Bu_Pasha;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] data = {{"Galuh", "1", "Sawojajar"},
                            {"Indro", "3", "Blimbing"},
                            {"Jedi", "2", "Lowokwaru"},
                            {"Kanu", "3", "Klojen"}};
        
        int[] harga = {1000, 1500, 2000};

        System.out.println("Masukkan ID Pelanggan");
        int id = in.nextInt();
        
        System.out.println("Masukkan jumlah pemakaian Kwh");
        int jumlahKwh = in.nextInt();
        System.out.println("Nama: " + data[id-1][0]);
        System.out.println("Golongan: " + data[id-1][1]);
        System.out.println("Alamat: " + data[id-1][2]);
        System.out.println("Jumlah Pemakaian Kwh " + jumlahKwh);
        System.out.println("Tagihan: " + "Rp. " + harga[Integer.parseInt(data[id-1][1])-1]*jumlahKwh);

    }
}
