package Latihan_UKL_Bu_Pasha;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Siswa");
        int jumlahSiswa = in.nextInt();
        float total_nilai = 0;
        for (int i=0; i<jumlahSiswa; i++){
            System.out.println("Nilai siswa ke-" + (i+1));
            float nilai = in.nextFloat();
            total_nilai += nilai;
        }
        System.out.println("Rata rata nilai adalah " + total_nilai/jumlahSiswa);
    }
}
