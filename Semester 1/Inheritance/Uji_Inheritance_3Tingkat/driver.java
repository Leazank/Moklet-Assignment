package Inheritance.Uji_Inheritance_3Tingkat;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Mobil atau Sepeda?");
        String vehicle = in.nextLine();
        if (vehicle.equalsIgnoreCase("mobil")) {
            System.out.println("Berapa jumlah rodanya?");
            int wheels = in.nextInt();
            System.out.println("Berapa harga?");
            double price = in.nextDouble();
            System.out.println("Jumlah pintu?");
            int doors = in.nextInt();
            System.out.println("Apakah itu mobil elektrik? (true atau false)");
            boolean electric = in.nextBoolean();
            System.out.println("Apakah itu mobil convertible? (true atau false)");
            boolean isConvertible = in.nextBoolean();
            if (isConvertible) {
                System.out.println("Apa tipe atapnya?");
                in.nextLine();
                String type = in.nextLine();
                System.out.println("Diskon gak? (true atau false)");
                boolean isDiscount = in.nextBoolean();
                if (isDiscount) {
                    System.out.println("Berapa persentase diskon?");
                    float discount = in.nextFloat();
                    double priceDiscount = price - ((price * discount) / 100);
                    Convertible c = new Convertible(wheels, priceDiscount, doors, electric, type);
                    c.print();
                    System.out.println("Harga sebelum diskon: " + price);
                } else {
                    Convertible c = new Convertible(wheels, price, doors, electric, type);
                    c.print();
                }
            } else {
                System.out.println("Diskon gak? (true atau false)");
                boolean isDiscount = in.nextBoolean();
                if (isDiscount) {
                    System.out.println("Berapa persentase diskon?");
                    float discount = in.nextFloat();
                    double priceDiscount = price - ((price * discount) / 100);
                    Car c = new Car(wheels, priceDiscount, doors, electric);
                    c.print();
                    System.out.println("Harga sebelum diskon: " + price);
                } else {
                    Car c = new Car(wheels, price, doors, electric);
                    c.print();
                }
            }
        } else if (vehicle.equalsIgnoreCase("sepeda")) {
            System.out.println("Berapa jumlah rodanya?");
            int wheels = in.nextInt();
            System.out.println("Berapa harga?");
            double price = in.nextDouble();
            System.out.println("Masukkan tipe sepeda (Mountain, Race, etc.)");
            in.nextLine();
            String type = in.nextLine();
            System.out.println("Diskon gak? (true atau false)");
            boolean isDiscount = in.nextBoolean();
            if (isDiscount) {
                System.out.println("Berapa persentase diskon?");
                float discount = in.nextFloat();
                double priceDiscount = price - ((price * discount) / 100);
                Bicycle b = new Bicycle(wheels, priceDiscount, type);
                b.print();
                System.out.println("Harga sebelum diskon: " + price);
            } else {
                Bicycle c = new Bicycle(wheels, price, type);
                c.print();
            }
        } else {
            System.out.println("Inputan tidak valid");
        }
    }
}
