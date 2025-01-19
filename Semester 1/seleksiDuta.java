import java.util.Scanner;
public class seleksiDuta {
    public static void main(String[] args) {
        String nama, namaPanggilan, kelas, perilaku;
        int rerataNilai;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama lengkap: ");
        nama = input.nextLine();
        System.out.print("Masukkan nama panggilan: ");
        namaPanggilan = input.nextLine();
        System.out.print("Masukkan Kelas (Angka romawi): ");
        kelas = input.nextLine();
        if ((kelas.equalsIgnoreCase("X")) || (kelas.equals("XI"))){
            System.out.print("Masukkan perilaku siswa (Baik/Cukup): ");
            perilaku = input.next();
            if (perilaku.equalsIgnoreCase("Baik")){
                System.out.print("Masukkan rerata nilai: ");
                rerataNilai = input.nextInt();
                if (rerataNilai >= 90){
                    System.out.println("Anda resmi menjadi Duta Wikusama!!!");
                }else{
                    System.out.println("Maaf " + namaPanggilan + ", anda tidak lolos seleksi Duta Wikusama");
                }
            }else{
                System.out.println("Maaf " + namaPanggilan + ", anda tidak lolos seleksi Duta Wikusama");
            }
        }else{
            System.out.println("Maaf " + namaPanggilan + ", anda tidak lolos seleksi Duta Wikusama");
        }
    }
}
