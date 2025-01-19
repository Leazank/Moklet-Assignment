package Inheritance.Uji_Inheritance_3Tingkat;

public class Vehicle {
    int numWheels;
    double price;

    public Vehicle(int numWheels, double price) {
        this.numWheels = numWheels;
        this.price = price;
    }

    public void print() {
        System.out.println("Jumlah roda: " + numWheels);
        System.out.println("Harga final: " + price);
    }

    public static void main(String[] args) {
        int[] angka = {1,2,3};
        int[] angka2 = new int[5];
    }
}

class Car extends Vehicle {
    int numDoors;
    boolean isElectric;

    public Car(int numWheels, double price, int jumlahPintu, boolean isElectric) {
        super(numWheels, price);
        this.numDoors = jumlahPintu;
        this.isElectric = isElectric;
    }

    public void print() {
        super.print();
        System.out.println("Jumlah pintu: " + numDoors);
        System.out.println("Elektrik: " + (isElectric ? "Ya" : "Tidak"));
    }
}

class Bicycle extends Vehicle {
    String bikeType;

    public Bicycle(int numWheels, double price, String bikeType) {
        super(numWheels, price);
        this.bikeType = bikeType;
    }

    public void print() {
        super.print();
        System.out.println("Bike Type: " + bikeType);
    }
}

class Convertible extends Car {
    String roofType;

    public Convertible(int numWheels, double price, int numDoors, boolean isElectric, String roofType) {
        super(numWheels, price, numDoors, isElectric);
        this.roofType = roofType;
    }

    public void print() {
        super.print();
        System.out.println("Roof Type: " + roofType);
    }
}
