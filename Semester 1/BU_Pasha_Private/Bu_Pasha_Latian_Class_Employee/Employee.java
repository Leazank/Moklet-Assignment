package BU_Pasha_Private.Bu_Pasha_Latian_Class_Employee;
public class Employee {
    private String nama;
    private double gaji;
    private float rating;
    private boolean status;

    public Employee(String nama, double gaji){
        this.nama = nama;
        this.gaji = gaji;

    }

    public Employee(){
        nama = "Unknown";
        gaji = 0;
        status = false;
    }

    public void print(){
        System.out.println("Nama Karyawan: " + this.nama);
        System.out.println("Gaji Karyawan: " + this.gaji);
    }

    //Getter
    public String getName(){
        return nama;
    }
    public double getSalary(){
        return gaji;
    }
    public float getRating(){
        return rating;
    }
    public boolean employeeFired(){
        return status;
    }

    //Setter
    public void setName(String nama){
        this.nama = nama;
    }
    public void setSalary(double gaji){
        this.gaji = gaji;
    }
    public void setRating(float rating){
        this.rating = rating;
    }
    public void fire(){
        this.status = true;
    }
    public void cutSalary(){
        this.gaji = gaji*0.9;
    }
    public void increaseSalary(){
        this.gaji = gaji*1.2;
    }
}
