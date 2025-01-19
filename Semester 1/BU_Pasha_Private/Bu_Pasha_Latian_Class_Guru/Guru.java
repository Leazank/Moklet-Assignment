package BU_Pasha_Private.Bu_Pasha_Latian_Class_Guru;

public class Guru {
    private int id;
    private String nama, mapel, alamat;

    public Guru(int id, String nama, String mapel, String alamat) {
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;

    }

    public Guru(){
        
        id = 0;
        nama = "Unknown";
        mapel = "Unknown";
        alamat = "Unknown";
    }

    public void profil(){
        System.out.println("=== Profil Guru ===");
        System.out.println("ID: " + this.id);
        System.out.println("Nama: " + this.nama);
        System.out.println("Mapel: " + this.mapel);
        System.out.println("Alamat: " + this.alamat);

    }
    public void profilPrivate(){
        System.out.println("=== Profil Guru Private ===");
        System.out.println("ID: " + this.id);
        System.out.println("Nama: " + this.nama);
        System.out.println("Mapel: " + this.mapel);
        System.out.println("Alamat: " + this.alamat);

    }

    //Getter
    public int getID(){
        return id;
    }    
    public String getName(){
        return nama;
    }    
    public String getSubjects(){
        return mapel;
    }    
    public String getAddresses(){
        return alamat;
    }    

    //Setter
    public void setID(int id){
        this.id = id;
    }
    public void setName(String nama){
        this.nama = nama;
    }
    public void setSubjects(String mapel){
        this.mapel = mapel;
    }
    public void setAddresses(String alamat){
        this.alamat = alamat;
    }

}
