package Latihan_UKL_Bu_Pasha;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Bilangannya");
        int n = in.nextInt();
        if (n % 2 == 0){
            System.out.println(n + " Adalah Bilangan Genap!");
        } else{
            System.out.println(n + " Adalah Bilangan Ganjil!");
        }
    }
}
