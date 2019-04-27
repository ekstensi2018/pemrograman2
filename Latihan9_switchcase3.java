import java.util.Scanner;

public class gaji{

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan Angka");
        int angka = inputUser.nextInt();
        
        switch (angka) {
            case 1 : System.out.println("Gaji anda 1500000");
            break;
            case 2 : System.out.println("gaji anda 2000000");
            break;
            case 3 : System.out.println("gaji anda 2500000");
            break;
            default : System.out.println("Masukkan pilihan angka antara 1-3!");
        }
    }
}
