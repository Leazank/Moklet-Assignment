package ujianPerulangan_Bu_Aul;

import java.util.Scanner;

public class soalA {
    public static void main(String[] args) {
        int jumlahTiket;
        double totalTiket=0;

        Scanner in = new Scanner(System.in);

        System.out.println("===Pendataan jumlah tiket yang terjual===");
        
        int i = 1;
        while (i < 8){
            System.out.println("Masukkan jumlah tiket yang terjual di hari " + i);
            jumlahTiket = in.nextInt();
            totalTiket += jumlahTiket;
            i++;

        } System.out.println("Total tiket yang terjual selama seminggu adalah " + totalTiket + " tiket");
        System.out.println("Rata rata tiket yang terjual dalam sehari adalah " + totalTiket/i);

    }
}
