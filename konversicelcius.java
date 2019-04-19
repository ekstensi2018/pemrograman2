/*

Author: Ferdiansyah Rahman
Tugas Pemrograman JAVA.
Soal: Buatlah sebuah program java yang membaca suatu derajat dalam celcius dari keyboard menggunakan kelas Scanner, kemudian mengkonversinya menjadi derajat fahrenheit
dan menampilkan hasilnya!

Terima Kasih
*/

import java.util.Scanner;
public class Konversi {

    public static void main(String[] args) {

        double fahrenheit, celcius;
        //Mendeklarasikan variabel

        Scanner inputdata = new Scanner(System.in);
        //Menambahkan objek input = scanner untuk //membaca dari keyboard//

        System.out.println("Masukan suhu dalam Celcius: ");
        //Perintah Untuk data yang ingin diinput

        celcius = inputdata.nextInt();
        //Penginputan data, secara spesifik nextInt untuk membaca tipe data Integer

        fahrenheit = celcius * 9 / 5 + 32;
        //Sebuah formula/rumus untuk konversi celcius ke fahrenheit

        System.out.println("Hasil Konversi:" + fahrenheit);
        //Menampilkan hasil/output program
    }
}
