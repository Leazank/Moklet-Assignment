package Inheritance;

public class Product {
    private int number;
    private int quantity;
    private double price;
    private String name;

    public Product(int number, int quantity, double price, String name) {
        this.number = number;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public Product() {
        number = 0;
        quantity = 0;
        price = 0;
        name = "Unknown";
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class CD extends Product {
    private String artist;
    private String label;
    private int numSong;

    public CD(int number, int quantity, double price, String name, String artist, String label, int numSong) {
        super(number, quantity, price, name);
        this.artist = artist;
        this.label = label;
        this.numSong = numSong;
    }

    public CD() {
        super();
        this.artist = "Unknown";
        this.label = "Unknown";
        this.numSong = 0;
    }

    
    public String getArtist() {
        return this.artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }
    
    public int getNumSong() {
        return this.numSong;
    }
    
    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }
    
    public void profile(){
        System.out.println("Name: " + super.getName() + "\nNumber: " + super.getNumber() + 
        "\nQuantity: " + super.getQuantity() + "\nPrice: " + super.getPrice() +
        "\nArtist: " + getArtist() + "\nLabel: " + getLabel() + "\nNumber of Song: " + getNumSong());
    }
}

class DVD extends Product {
    private String studio;
    private int length;
    private double rating;

    public DVD(int number, int quantity, double price, String name, String studio, int length, double rating) {
        super(number, quantity, price, name);
        this.studio = studio;
        this.length = length;
        this.rating = rating;
    }

    public DVD() {
        super();
        this.studio = "Unknown";
        this.length = 0;
        this.rating = 0;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void profile(){
        System.out.println("Name: " + super.getName() + "\nNumber: " + super.getNumber() + 
        "\nQuantity: " + super.getQuantity() + "\nPrice: " + super.getPrice() +
        "\nArtist: " + getStudio() + "\nLabel: " + getLength() + "\nNumber of Song: " + getRating());
    }

}
// Kenapa deklarasi vgariable dipisah? Karena supaya tidak error saat membuat
// getter setter menggunaakan ekstensi
// Menambahkan classs tidak harus beda file, bisa di satu file dan cukup gunakan
// class, bukan public class