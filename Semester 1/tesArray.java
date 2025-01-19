import java.util.Scanner;

import Inheritance.Uji_Inheritance_3Tingkat.Vehicle;

public class tesArray {
    public static void main(String[] args) {
        // String[] arr = {"Bara","Shabri","Yanto"};
        // int arr2 [] = {1,2,3,4,5,6,7,8,9,10};    
        
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // System.out.println();
        // for (int i = 0; i < arr2.length; i++) {   
        //     System.out.println(arr2[i]);
        // }

        // for (String bara : arr){
        //     System.out.println(bara);
        // } // Yang di akses elemennya, bukan indexnya

        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah object: ");
        int jumlahObject = input.nextInt();
        Vehicle v[] = new Vehicle[jumlahObject];
        
        for(int i=0; i<jumlahObject; i++){
            System.out.println("Jumlah roda: ");
            int numwheels = input.nextInt();
            System.out.println("Harga: ");
            double price = input.nextDouble();
            v[i] = new Vehicle(numwheels, price);
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println("===Data Vehicle ke-" + (i+1) + "===");
            v[i].print();
        }

    }
}