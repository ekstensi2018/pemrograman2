import java.util.Scanner;
public class rental {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
 
        
        // input data pemimjam
        System.out.print("Nama Peminjam : " );
        String nama =input.nextLine();

        System.out.print("Jumlah Mobil yang dipinjam: " );
        int jumlah_mobil=input.nextInt();
        
        //pengecekan jumlah mobil yang di gunakan 
        if( jumlah_mobil >5)
            {
                System.out.println("Maaf hanya boleh pinjam 5 mobil. MOBIL YANG ANDA PINJAM TERLALU BANYAK ...!!!");
            
            }
        else
            {
                System.out.print("Lama Pinjam : ");
                int lama = input.nextInt();
                
                int total_harga = jumlah_mobil*35000;
                System.out.println("Harga total yang di bayarkan "+total_harga);
                
                
                if( lama > 7)
                    {
                        int denda = total_harga*35/100;
                        int harga_plus_denda = total_harga + denda;
                        System.out.println("Denda anda adalah "+denda);
                        System.out.println("Harga plus denda anda adalah "+harga_plus_denda);
                        
                    }
                }
            }
    }
