package latihan_bu_aul;

import java.util.Scanner;

public class soal2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah jam kerja karyawan: ");
        int jumlah_jam = input.nextInt();
        System.out.print("Masukkan tarif yang diterima karyawan dalam satu jam: ");
        double tarif = input.nextDouble();

        double gaji_bersih = (jumlah_jam*tarif)*90/100;
        System.out.println("Gaji bersih yang diterima adalah " + gaji_bersih);

    }
}
