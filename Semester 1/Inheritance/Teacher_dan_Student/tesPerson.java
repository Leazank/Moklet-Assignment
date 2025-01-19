package Inheritance.Teacher_dan_Student;

import java.util.Scanner;

public class tesPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mau ngedata? (Ya/Tidak) ");
        String keputusan = input.next();

        if (keputusan.equalsIgnoreCase("Ya")) {
            System.out.println("Njenengan badhenya ngisi data Student/Teacher?");
            String pilihan1 = input.next();

            if (pilihan1.equalsIgnoreCase("Student")) {
                Student murid1 = new Student();

                System.out.println("Njenengan badhe ngedata berapa siswa?");
                int jumlah = input.nextInt();

                int i = 0;
                while (i < jumlah) {
                    System.out.print("Masukkan nama: ");
                    String nama = input.nextLine();
                    murid1.name = nama;
                    System.out.print("Masukkan umur: ");
                    int umur = input.nextInt();
                    murid1.age = umur;
                    System.out.print("Masukkan ID siswa: ");
                    int id = input.nextInt();
                    murid1.studentNumber = id;
                    System.out.print("Masukkan jurusan siswa: ");
                    String jurusan = input.nextLine();
                    murid1.major = jurusan;
                    System.out.print("Masukkan nilai siswa: ");
                    int nilai = input.nextInt();
                    murid1.score = nilai;
                    i++;
                }
                murid1.print();

            } else {

                System.out.println("Njenengan badhe ngedata guru Fulltime utawi Parttime?");
                String pilihan2 = input.next();

                if (pilihan2.equalsIgnoreCase("Fulltime")) {
                    Fulltime fulltime1 = new Fulltime();

                    System.out.println("Njenengan badhe ngedata berapa guru?");
                    int jumlah = input.nextInt();

                    int i = 0;
                    while (i < jumlah) {
                        System.out.print("Masukkan nama: ");
                        String nama = input.nextLine();
                        fulltime1.name = nama;
                        System.out.print("Masukkan umur: ");
                        int umur = input.nextInt();
                        fulltime1.age = umur;
                        System.out.print("Masukkan gaji tahunan guru: ");
                        int gajiTahunanTotal = input.nextInt();
                        fulltime1.annualSalary = gajiTahunanTotal;
                        System.out.print("Masukkan unit guru: ");
                        String unit = input.nextLine();
                        fulltime1.unit = unit;
                        i++;
                    }
                    fulltime1.print();

                } else if (pilihan2.equalsIgnoreCase("Parttime")) {
                    Parttime parttime1 = new Parttime();

                    System.out.println("Njenengan badhe ngedata berapa guru?");
                    int jumlah = input.nextInt();
                    input.nextLine();

                    int i = 0;
                    while (i < jumlah) {
                        System.out.print("Masukkan nama: ");
                        String nama = input.nextLine();
                        parttime1.name = nama;
                        System.out.print("Masukkan umur: ");
                        int umur = input.nextInt();
                        parttime1.age = umur;
                        System.out.print("Masukkan durasi jam kerja guru: ");
                        int jamKerjaSehari = input.nextInt();
                        parttime1.hoursWorked = jamKerjaSehari;
                        i++;
                    }
                    parttime1.print();

                } else {
                    System.out.println("Invalid!");
                }
            }
        } else{
            Parttime parttime2 = new Parttime("Yanto", 34, "Matematika", 8);
            System.out.println("Sebelum add salary: " + parttime2.getAnnualSalary());
            parttime2.setAnnualSalary(50_000);                              
            System.out.println("Sesudah add salary: " + parttime2.getAnnualSalary());
        }

        
    }

    public static double jumlah(double num1, double num2){
        return num1 + num2;
    }

}
