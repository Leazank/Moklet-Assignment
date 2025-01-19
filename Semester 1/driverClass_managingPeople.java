import BU_Pasha_Private.Bu_Pasha_Latian_Class_Employee.Employee;

public class driverClass_managingPeople {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jane", 3500000);
        Employee e2 = new Employee("Brandon", 2000000);
        Employee e3 = new Employee("Anna", 2500000);

        e1.print();
        e2.print();
        e3.print();
    }
}
