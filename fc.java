import java.util.Scanner;

public class fc

{

    public static void main(String args[])

    {

        Scanner masuk = new Scanner(System.in);

        int jl, jumlah, hlbr;
        String member;
        System.out.println("SELAMAT DATANG DI BAGUS FOTO COPY");
        System.out.print("Apakah Pelanggan? =");
        member = masuk.nextLine();
        System.out.print("Jumlah Fotokopi =");
        jl = masuk.nextInt();

        if (member.equalsIgnoreCase("Y")) {

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
