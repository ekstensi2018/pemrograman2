/*

Author: Ferdiansyah Rahman
Tugas Pemrograman JAVA.
Soal: Buatlah sebuah program java yang membaca tinggi dan alas suatu segitiga dari keyboard menggunakan kelas scanner. kemudian menghitung
luas dari segitiga tersebut dan menampilkan hasilnya!

*/

import java.util.Scanner;
public class luassegitiga {

    public static void main(String[] args) {

        int alas;
        int tinggi;
        double luas;
        //Mendeklarasikan variabel

        Scanner inputdata = new Scanner(System.in);
        //Menambahkan objek input = scanner

        System.out.print("Masukan panjang Alas segitiga : ");
        //Perintah Untuk data yang ingin diinput

        alas = inputdata.nextInt();
        //Penginputan data, secara spesifik nextInt untuk membaca tipe data Integer

        System.out.print("Masukan Tinggi Segitiga: ");
        //Perintah Untuk data yang ingin diinput

        tinggi = inputdata.nextInt();
        //Penginputan data, secara spesifik nextInt untuk membaca tipe data Integer

        luas = ((alas * tinggi)/2);
        //Sebuah formula/rumus untuk mencari luas segitiga

        System.out.println("Luas Segitiga = " +luas);
        //Menampilkan hasil/output program
    }
}
