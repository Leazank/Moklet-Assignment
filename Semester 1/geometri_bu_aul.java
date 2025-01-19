import java.util.Scanner;

public class geometri_bu_aul {
    public static void main(String[] args) {
        double panjang, lebar, hasil, alas, tinggi;

        Scanner input = new Scanner(System.in);
        System.out.println("== PROGRAM PENGUKUR LUAS BANGUN DATAR ==");
        System.out.println("Kamu mau ngukur bangun apa?");
        System.out.println("Kami menyediakan Segitiga, Persegi_Panjang, Jajar_Genjang");
        System.out.println("Pilih diantara ketiga bangun tersebut");
        String bangun = input.next();
        if (bangun.equals("Segitiga")){
            System.out.println("Berapa alas segitiganya?");
            alas = input.nextInt();
            System.out.println("Berapa tinggi segitiganya?");
            tinggi = input.nextInt();
            hasil = alas*tinggi/2;
            System.out.println("Luas segitiga =" + " " + hasil);}
        else if (bangun.equals("Persegi_Panjang")){
            System.out.println("Berapa panjang persegi panjangnya");
            panjang = input.nextInt();
            System.out.println("Berapa lebar persegi panjangnya");
            lebar = input.nextInt();
            hasil = panjang*lebar;
            System.out.println("Luas segitiga =" + " " + hasil);
        }
        else if (bangun.equals("Jajar_Genjang")){
            System.out.println("Berapa alas jajar genjangnya");
            alas = input.nextInt();
            System.out.println("Berapa tinggi jajar genjangnya");
            tinggi = input.nextInt();
            hasil = alas*tinggi;
            System.out.println("Luas jajar genjang =" + " " + hasil);
        }
        else {
            System.out.println("Tidak ada pilihan bangun tersebut");
        }
    }
}

