package Bu_Pasha_Materi_Class;

import java.util.Scanner;

//Driver Class
public class TesSiswa {
    public static void main(String[] args) {
        //Membuat Objek
        Siswa dhianSigma = new Siswa();
        Siswa ochiSkibidi = new Siswa();
        dhianSigma.id = 32847978;
        dhianSigma.nama = "Ardian Pratama";
        dhianSigma.ipk = 1.0;
        ochiSkibidi.id = 84320984;
        ochiSkibidi.nama = "Navalovsky Allenzo";
        ochiSkibidi.ipk = -4.0;
        dhianSigma.print();

        Scanner input = new Scanner(System.in);
        Siswa profil  = new Siswa();
        System.out.print("Masukkan nama anda: ");
        profil.nama = input.nextLine(); //Masukin string berspasi spasi
        System.out.print("Masukkan id anda: ");
        profil.id = input.nextInt();
        System.out.print("Masukkan ipk anda");
        profil.ipk = input.nextDouble();
    }
}
