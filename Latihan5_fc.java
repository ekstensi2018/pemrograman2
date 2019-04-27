import java.util.Scanner;

public class fc

{

    public static void main(String args[])

    {

        Scanner masuk = new Scanner(System.in);
        //deklarasi tipe data
        int jl, jumlah, hlbr;
        String member;
        System.out.println("SELAMAT DATANG DI BAGUS FOTO COPY");
        
        //Input apakah customer merupakan anggota/pelanggan tetap
        System.out.print("Apakah Pelanggan? (Y/N) =");
        member = masuk.nextLine();
        
        //Input jumlah fotokopi
        System.out.print("Jumlah Fotokopi =");
        jl = masuk.nextInt();
        
        //equalsignorecase digunakan untuk membandingkan String dengan tidak memperdulikan huruf besar dan kecilnya.
        if (member.equalsIgnoreCase("Y")) {
            //pembeda harga antara member dan tidak

            hlbr = 100;

            jumlah = jl * hlbr;

            System.out.print("Bayar = Rp " + jumlah);

        } else {

            if (jl <= 100)

            {

                hlbr = 200;

                jumlah = jl * hlbr;

                System.out.print("Bayar = Rp " + jumlah);

            } else if (jl >= 100 && jl <= 200)

            {

                hlbr = 170;

                jumlah = jl * hlbr;

                System.out.println("Bayar = Rp " + jumlah);

            } else if (jl >= 200)

            {

                hlbr = 150;

                jumlah = jl * hlbr;

                System.out.println("Bayar = Rp " + jumlah);

            }
        }

    }

}
