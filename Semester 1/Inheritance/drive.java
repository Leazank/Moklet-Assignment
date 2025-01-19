package Inheritance;

import java.util.Scanner;

public class drive {
    public static void main(String[] args) {
        Product product_input = new Product();
        CD cd_input = new CD();
        DVD dvd_input = new DVD();
        Scanner in = new Scanner(System.in);

        System.out.println("Ingin input berapa produk?");
        int jumlah = in.nextInt();
        if (jumlah > 10) {
            System.out.println("Maaf, Maksimal input hanya 10 produk");
        } else {
            for (int a = 0; a < jumlah; a++) { // Ini kayak for a in range(0, jumlah)
                System.out.println("Lengkapi data produk yang anda beli:");
                System.out.print("Nama produk: ");
                product_input.setName(in.nextLine());
                in.nextLine();
                System.out.print("Nomor produk: ");
                product_input.setNumber(in.nextInt());
                System.out.print("Jumlah produk: ");
                product_input.setQuantity(in.nextInt());
                System.out.print("Harga produk: ");
                product_input.setPrice(in.nextDouble());

                System.out.println("Jenis produk anda CD atau DVD?");
                String jenis_input = in.next();
                if (jenis_input.equalsIgnoreCase("CD")) {
                    System.out.println("Siapa artisnya?");
                    cd_input.setArtist(in.nextLine());
                    in.nextLine();
                    System.out.println("Berapa jumlah lagunya?");
                    cd_input.setNumSong(in.nextInt());
                    in.nextLine();
                    System.out.println("Apa label musiknya?");
                    cd_input.setLabel(in.nextLine());

                    System.out.println("Berikut overview produk yang anda beli keseluruhan:" + "\nNama produk: "
                            + cd_input.getName() + "\nNomor produk: " + cd_input.getNumber() + "\nJumlah produk: "
                            + cd_input.getQuantity()
                            + "Harga produk: " + cd_input.getPrice() + "\n" + "\nArtis: " + cd_input.getArtist()
                            + "\nJumlah lagu: " + cd_input.getNumSong()
                            + "\nLabel: " + cd_input.getLabel());
                } else if (jenis_input.equalsIgnoreCase("DVD")) {
                    System.out.println("Berapa durasinya?");
                    dvd_input.setLength(in.nextInt());
                    System.out.println("Berapa ratingnya");
                    dvd_input.setRating(in.nextDouble());
                    System.out.println("Diproduksi oleh studio mana");
                    dvd_input.setStudio(in.nextLine());

                    System.out.println("Berikut overview produk yang anda beli keseluruhan:" + "\nNama produk: "
                            + cd_input.getName() + "\nNomor produk: " + cd_input.getNumber() + "\nJumlah produk: "
                            + cd_input.getQuantity()
                            + "Harga produk: " + cd_input.getPrice() + "\n" + "\nDurasi: " + dvd_input.getLength()
                            + "\nRating: " + dvd_input.getRating()
                            + "\nStudio: " + dvd_input.getStudio());
                } else {
                    System.out.println("Maaf, jenis produk tersebut tidak ada. Atau mungkin terdapat salah penulisan");
                }
            }
        }
    }
}
