package Inheritance;

import java.util.Scanner;

public class inheritanceBaru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CD/DVD");
        String pilihan = input.next();

        input.nextLine(); //Reset Scanner Input
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Number: ");
        int number = input.nextInt();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        System.out.println("Price: ");
        double price = input.nextDouble();
        input.nextLine();

        if (pilihan.equalsIgnoreCase("cd")) {
            System.out.print("Artist: ");
            String artist = input.nextLine();
            System.out.print("Label: ");
            String label = input.nextLine();
            System.out.print("Total Song: ");
            int numSong = input.nextInt();

            input.nextLine();

            CD c1 = new CD(number, quantity, price, name, artist, label, numSong);
            c1.profile();

        } else if (pilihan.equalsIgnoreCase("dvd")) {

            System.out.print("Studio: ");
            String studio = input.nextLine();
            System.out.print("Length: ");
            int length = input.nextInt();
            System.out.print("Rating :");
            double rating = input.nextDouble();

            input.nextLine();

            DVD d1 = new DVD(number, quantity, price, name, studio, length, rating);
            d1.profile();

        } else {
            System.out.println("Ga ada jenis produk kek gitu disini");
        }
    }
}
