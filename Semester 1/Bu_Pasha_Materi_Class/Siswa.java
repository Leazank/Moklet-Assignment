package Bu_Pasha_Materi_Class;

//Object Class (Kelas Objek)
public class Siswa {
    int id;
    String nama;
    double ipk;

    /*Constructor (Namanya harus sama dengan nama class, dalam hal ini, Siswa)
    ini adalah constructor pertama (Constructor Default)*/
    public Siswa(){
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
    public Siswa(int id, String nama, double ipk) {
        this.id = id; //this. itu di python kayak self
        this.nama = nama;
        this.ipk = ipk;
    }
    
    //method
    public void print(){
        System.out.println("Id anda adalah " + id);
        System.out.println("Nama anda adalah " + nama);
        System.out.println("IPK anda adalah " + ipk);
    }
}
