import java.util.Scanner;
public class kelas {
    public static void main(String[] args) {
        int pilihan;
        String kelas;
        Scanner in = new Scanner(System.in);

        System.out.println("List angka kelas: \n1 = X RPL 1\n2 = X RPL 2\n3 = X RPL 3\n4 = X RPL 4\n5 = X RPL 5\n6 = X RPL 6");
        System.out.print("Masukkan pilihan kelas: ");
        pilihan = in.nextInt();

        switch (pilihan){
            case 1:
                kelas = "X RPL 1";
                break;
            case 2:
                kelas = "X RPL 2";
                break;
            case 3:
                kelas = "X RPL 3";
                break;
            case 4:
                kelas = "X RPL 4";
                break;
            case 5:
                kelas = "X RPL 5";
                break;
            case 6:
                kelas = "X RPL 6";
                break;
            
            default:
                kelas = "Kelas tidak terdaftar";
        }
        System.out.println("Kelas yang dipilih adalah " + kelas);
    }
}
