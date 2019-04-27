import java.util.Scanner;

public class PraktikumTigaBelasAa{

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan Nama Anda");
        String nama = inputUser.nextLine();

        System.out.println("Berapa umur anda? \n 1. Kurang dari 20thn \n 2. lebih dari 20th \n 3. sama dengan 20th \n Masukan pilihan anda");
        int pilihanUmur = inputUser.nextInt();

        switch (pilihanUmur) {
            case 1 : System.out.println(" Anda "+nama+" berumur kurang dari 20th");
            break;
            case 2 : System.out.println(" Anda "+nama+" berumur lebih dari 20th");
            break;
            case 3 : System.out.println(" Anda "+nama+" sama dengan 20th");
            break;
            default : System.out.println("Masukkan pilihan angka antara 1-3!");
        }
    }
}
