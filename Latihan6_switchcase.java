import java.util.Scanner;

public class PraktikumTigaBelas
{
    public static void main(String[] args) {
        Scanner bacaInput = new Scanner(System.in);
        System.out.print("Masukan nilai index huruf (A,B,C,D,E) =");
        String indeksHuruf = bacaInput.next();
        char indeks = indeksHuruf.charAt(0);
        switch (indeks){
            case 'A' : System.out.println("Nilai Anda Sangat Bagus!");
            break;
            case 'B' : System.out.println("Nilai Anda Bagus!");
            break;
            case 'C' : System.out.println("Nilai Anda Cukup!");
            break;
            case 'D' : System.out.println("Nilai Anda Kurang!");
            break;
            case 'E' : System.out.println("Nilai Anda Sangat Kurang!");
            break;
            default : System.out.println("Salah Memasukan indeks huruf!");
        }
    }
}
