import java.util.Scanner;

public class Prak_203

{

    public static void main(String args[])

    {

        Scanner masuk = new Scanner(System.in);

        int nilai;
        String output, jurusan;


        System.out.print("Masukan jurusan =");
        jurusan = masuk.nextLine();

        System.out.print("Masukan Nilai =");
        nilai = masuk.nextInt();


        if (jurusan.equalsIgnoreCase("ipa")) {
            if (nilai >= 82 && nilai <= 100) {
                System.out.println("Anda telah memenuhi syarat kelulusan");

            } else if (nilai >= 0 && nilai <= 82) {
                System.out.println("Anda tidak memenuhi syarat kelulusan");

            }

        } else if (jurusan.equalsIgnoreCase("bahasa")) {

            if (nilai >= 75 && nilai <= 100) {
                System.out.println("Anda berhak mendapat program beasiswa");

            } else if (nilai >= 0 && nilai <= 75) {
                System.out.println("anda tidak berhak mendapat program beasiswa");

            }
        }

    }

}
