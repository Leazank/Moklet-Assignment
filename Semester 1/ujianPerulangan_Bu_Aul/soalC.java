package ujianPerulangan_Bu_Aul;

import java.util.Scanner;

public class soalC {
    public static void main(String[] args) {
        double gaji, totalGaji = 0;

        Scanner in = new Scanner(System.in);

        int i = 1;
        while (i < 6) {
            System.out.println("Masukkan gaji bulanan karyawan ke " + i);
            gaji = in.nextDouble();
            totalGaji += gaji;
            i++;
        } System.out.println("Total gaji 5 karyawan selama sebulan adalah " + totalGaji);
    }
}
