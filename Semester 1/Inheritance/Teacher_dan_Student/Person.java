package Inheritance.Teacher_dan_Student;

public class Person {
    String name;
    int age;

    public Person(String asma, int yuswa) {
        this.name = asma;
        this.age = yuswa;
    }

    public Person() {
        this.name = "Mboten ngertos";
        this.age = 0;
    }

    public void print() {
        System.out.println("Kenalin, ini " + name + ", dia berumur " + age + " tahun");
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String asma, int yuswa, String mapel) {
        super(asma, yuswa);
        this.subject = mapel;
    }

    public Teacher() {
        this.name = super.name;
        this.age = super.age;
        this.subject = "Mboten ngertos";
    }

    public void print() {
        System.out.println("Kenalin, ini " + name + ", dia berumur " + age + " tahun" + ", dia ngajar " + subject);
    }

}

class Fulltime extends Teacher {
    int annualSalary;
    String unit;

    public Fulltime(String asma, int yuswa, String mapel, int gajiTaunan, String penempatan) {
        super(asma, yuswa, mapel);
        this.name = asma;
        this.age = yuswa;
        this.subject = mapel;
        this.annualSalary = gajiTaunan;
        this.unit = penempatan;
    }

    public Fulltime() {
        this.name = super.name;
        this.age = super.age;
        this.subject = super.subject;
        this.annualSalary = 0;
        this.unit = "Mboten ngertos";
    }

    public void print() {
        System.out.println("Kenalin, ini " + name + ", dia berumur " + age + " tahun" + ", dia ngajar " + subject + "."
                +
                "Dia ini guru Fulltime, " + "setaun gajinya " + annualSalary + ", disini dia ditempatkan di " + unit);
    }
}

class Parttime extends Teacher {
    int hoursWorked;
    int gajiTahunan;

    public Parttime(String asma, int yuswa, String mapel, int jamKerja) {
        super(asma, yuswa, mapel);
        this.name = asma;
        this.age = yuswa;
        this.subject = mapel;
        this.hoursWorked = jamKerja;
    }

    public Parttime() {
        this.name = super.name;
        this.age = super.age;
        this.subject = super.subject;
        this.hoursWorked = 0;
    }

    public void setAnnualSalary(int gajiPerjam) {
        this.gajiTahunan = this.hoursWorked * gajiPerjam * 365;
    }

    public int getAnnualSalary() {
        return this.gajiTahunan;
    }
}

class Student extends Person {
    int studentNumber, score;
    String major;

    public Student(String asma, int yuswa, int ID, int nilai, String jurusan) {
        this.name = super.name;
        this.age = super.age;
        this.studentNumber = ID;
        this.score = nilai;
        this.major = jurusan;
    }

    public Student(){
        this.name = super.name;
        this.age = super.age;
        this.studentNumber = 0;
        this.score = 0;
        this.major = "Nganggur";
    }

    public void print(){
        System.out.println("Kenalin, ini " + name + ", dia berumur " + age + " tahun" +
        "ID nya " + studentNumber + ", terus nilainya " + score + ", dan dia berasal dari jurusan " + major);
    }

}