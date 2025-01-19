import java.util.Scanner;

public class tes_bu_aul {
    public static void main(String[] args) {
        // String nama="Shabri";
        // String alamat="Singosari";
        // int usia=16;
        // char jenisKelamin='l';
        // double beratBadan=58.00;
        // boolean status=true;
        // System.out.println("Nama saya " + nama);
        // System.out.println("Alamat saya di " + alamat);
        // System.out.println("Usia saya " + usia);
        // System.out.println("Gender saya " + jenisKelamin);
        // System.out.println("Beratku " + beratBadan);
        // System.out.println("Status " + status);
        // Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan Nama Lengkap: ");
        // String nama = input.next();
        // System.out.println("Yow " + nama + ", yang semangat belajar Javanya");
        // System.out.println("Kalo boleh tau, umur berapa nih? ");
        // System.out.print("Masukkan umur: ");
        // int umur = input.nextInt();
        // System.out.println("Ohh umur " + umur + " ya...");
        // System.out.print("Lakik (L) atau Perempuan (P)? ");
        // char gender = input.next().charAt(0);
        // System.out.println("Okee " + gender + " yaa");

        // int x, y, z;
        // x = input.nextInt();

        // double harga;
        // int jumlah;
        // char barang;

        // Scanner in = new Scanner(System.in);
        // System.out.println("Halo! Kami Menyediakan Barang-barang berikut:");
        // System.out.println("1. Laptop\n2. Handphone\n3. Mouse\n4. Keyboard");
        // barang = in.next().charAt(1);
        // if (barang == 1){

        // }

        // Scanner input = new Scanner(System.in);
        // int jumlahSiswa;
        // double nilai;
        // double total = 0;

        // System.out.println("Berapa siswa yang ingin anda input?");
        // jumlahSiswa = input.nextInt();
        // int n = 0;

        // do{
        // System.out.println("Masukkan nilai siswa ke " + (n+1));
        // nilai = input.nextDouble();
        // total += nilai;
        // n++;
        // } while (n < jumlahSiswa);

        // System.out.println("Rata rata nilai siswa adalah " + total);
        // while (n < jumlahSiswa){
        // n++;
        // System.out.println("Masukkan nilai dari siswa ke " + n);
        // nilai = input.nextDouble();
        // total += nilai;
        // n--;
        // n++;
        // }
        // total /= jumlahSiswa;
        // System.out.println("Rata rata nilai siswa adalah " + total);

        // Scanner in = new Scanner(System.in);
        // int hasil = 1, num;
        // num = in.nextInt();
        // while (num != 1){
        // hasil *= num;
        // num -= 1;
        // }
        // System.out.println(hasil);

        // Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan Jumlah Panitia: ");
        // int jumlahPanitia = input.nextInt();
        // String panitiaBulba[] = new String[jumlahPanitia];
        // for (int i = 0; i < panitiaBulba.length; i++) {
        //     System.out.print("Masukkan panitia ke-" + (i + 1) + ": ");
        //     panitiaBulba[i] = input.next();
        // }
        // for (int i = 0; i < panitiaBulba.length; i++) {
        //     System.out.println("Panitia ke-" + (i + 1) + ": " + panitiaBulba[i]);
        // }

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Barang: ");
        int inputJumlah = input.nextInt();
        String namaBarang[] = new String[inputJumlah];
        double hargaBarang[] = new double[inputJumlah];
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.print("Masukkan Barang ke-" + (i + 1) + ": ");
            namaBarang[i] = input.next();
            System.out.print("Masukkan Harga Barang ke-" + (i + 1) + ": ");
            hargaBarang[i] = input.nextDouble();
        }
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println("Barang ke-" + (i + 1) + ": " + namaBarang[i]);
            System.out.println("Harga Barang ke-" + (i + 1) + ": " + hargaBarang[i]);
        }



    }
}

// Shortcut : ctrl + / untuk ngubah jadi command
// Shortcut : alt + shift + up/down arrow untuk copas secara otomatis ke row
// berikutnya
// Shortcut : ctrl + alt + up/down arrow untuk memperbanyak kursor ke row
// berikutnya
// Shortcut : ctrl + d untuk memperbanyak kursor ke kode yang sama saja
// Shortcut : ctrl + a, kemudian alt + shift + s untuk merapikan codingan
