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
}
