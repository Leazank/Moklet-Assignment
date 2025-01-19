package Bu_Pasha_Materi_Class;

//Object Class (Kelas Objek)
public class Siswa_Private {
    private int id;
    private String nama;
    private double ipk;

    /*Constructor (Namanya harus sama dengan nama class, dalam hal ini, Siswa)
    ini adalah constructor pertama (Constructor Default)*/
    public Siswa_Private(){
        id = 0;
        nama = "";
        ipk = 0;
    //Diatas ini adalag constructor parameter
    }

    // public Siswa(int x, String y, double z) {
    //     id = x;
    //     nama = y;
    //     ipk = z;
    // }
    public Siswa_Private(int id, String nama, double ipk) {
        this.id = id; //this. itu di python kayak self
        this.nama = nama;
        this.ipk = ipk;
    }
    
    //Getter ->> Mendapatkan nilai ->> Tipe data
    public int getID(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public double getIpk(){
        return ipk;
    }

    //Setter ->> Mengubah nilai ->> void
    public void setID(int id){
        this.id = id;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }
    //method tdk menghasilkan value
    public void print() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }

    //method yang menghasilkan value
    public String print2() {
        return "ID : " + id
        + "\nNama : " + nama
        + "\nIPK : " + ipk;
    }
}
