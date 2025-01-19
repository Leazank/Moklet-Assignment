package Bu_Pasha_Praktek_Class_Guru_Java;

public class DriverClassGuru {
    public static void main(String[] args) {
        ObjectClassGuru bu_pasha = new ObjectClassGuru();
        ObjectClassGuru bu_aul = new ObjectClassGuru();
        ObjectClassGuru bu_feni = new ObjectClassGuru();
        ObjectClassGuru pak_diaur = new ObjectClassGuru();
        ObjectClassGuru pak_chus = new ObjectClassGuru();

        bu_pasha.id = 123;
        bu_pasha.nama = "Pashatania Fitri Indah Lestari";
        bu_pasha.alamat = "Tokyo, Jepang";
        bu_pasha.mapel = "Produktif RPL";
        bu_aul.id = 345;
        bu_aul.nama = "Aulia Mas'adah";
        bu_aul.alamat = "Cambridge, Amerika";
        bu_aul.mapel = "Produktif RPL, Tahfidz";
        bu_feni.id = 567;
        bu_feni.nama = "Fenilia Mayrini";
        bu_feni.alamat = "Seoul, Korea Selatan";
        bu_feni.mapel = "Matematika";
        pak_diaur.id = 789;
        pak_diaur.nama = "Diaur Rahman";
        pak_diaur.alamat = "Sydney, Australia";
        pak_diaur.mapel = "IPAS-Fisika, PJOK";
        pak_chus.id = 901;
        pak_chus.nama = "Muhammad Chusni";
        pak_chus.alamat = "Moskow, Rusia";
        pak_chus.mapel = "Kesiswaan";

        System.out.println("==IDENTITAS BU PASHA==");
        System.out.println("ID: " + bu_pasha.id);
        System.out.println("Nama: " + bu_pasha.nama);
        System.out.println("Alamat: " + bu_pasha.alamat);
        System.out.println("Mata pelajaran: " + bu_pasha.mapel);
        System.out.println("==IDENTITAS BU AUL==");
        System.out.println("ID: " + bu_aul.id);
        System.out.println("Nama: " + bu_aul.nama);
        System.out.println("Alamat: " + bu_aul.alamat);
        System.out.println("Mata pelajaran: " + bu_aul.mapel);
        System.out.println("==IDENTITAS BU FENI==");
        System.out.println("ID: " + bu_feni.id);
        System.out.println("Nama: " + bu_feni.nama);
        System.out.println("Alamat: " + bu_feni.alamat);
        System.out.println("Mata pelajaran: " + bu_feni.mapel);
        System.out.println("==IDENTITAS PAK DIAUR==");
        System.out.println("ID: " + pak_diaur.id);
        System.out.println("Nama: " + pak_diaur.nama);
        System.out.println("Alamat: " + pak_diaur.alamat);
        System.out.println("Mata pelajaran: " + pak_diaur.mapel);
        System.out.println("==IDENTITAS PAK CHUS==");
        System.out.println("ID: " + pak_chus.id);
        System.out.println("Nama: " + pak_chus.nama);
        System.out.println("Alamat: " + pak_chus.alamat);
        System.out.println("Mata pelajaran: " + pak_chus.mapel);

    }
}
