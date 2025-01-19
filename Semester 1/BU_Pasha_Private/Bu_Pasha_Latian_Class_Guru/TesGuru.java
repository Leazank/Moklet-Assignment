package BU_Pasha_Private.Bu_Pasha_Latian_Class_Guru;

import java.util.Scanner;

public class TesGuru {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int id;
        String nama, mapel, alamat;

        System.out.print("Masukkan ID guru: ");
        id = masukan.nextInt();
        masukan.nextLine();  // Tambahkan ini untuk menangani newline
        System.out.print("Masukkan nama guru: ");
        nama = masukan.nextLine();
        System.out.print("Masukkan mapel yang diampu guru tersebut: ");
        mapel = masukan.nextLine();
        System.out.print("Masukkan alamat guru: ");
        alamat = masukan.nextLine();

        Guru profilGuru = new Guru(id, nama, mapel, alamat);
        profilGuru.profil();

        
        Guru guru1 = new Guru();
        guru1.setID(123);
        guru1.setName("Pasha");
        guru1.setSubjects("Produktif RPL");
        guru1.setAddresses("Malang");;

        guru1.profilPrivate();
    }
}
