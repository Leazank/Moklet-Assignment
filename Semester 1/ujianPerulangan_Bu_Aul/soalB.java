package ujianPerulangan_Bu_Aul;

import java.util.Scanner;

public class soalB {
    public static void main(String[] args) {
        int barangMasuk, totalBarang = 0;

        Scanner in = new Scanner(System.in);

        int i = 1;
        while (i < 6){
            System.out.println("Jumlah barang yang masuk di hari ke-" + i);
            barangMasuk = in.nextInt();
            totalBarang += barangMasuk;
            i++;
        } System.out.println("Jumlah barang selama 5 hari adalah " + totalBarang);
    }
}
