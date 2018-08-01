package program_kasir;
import java.util.Scanner;
public class Kasir {

    public static void main(String[] args) {
       kasir pembayaran = new kasir();
       pembayaran.belanja();
    }
    
}
class kasir{
    public void belanja(){
        
         
        int jml, ulangi, anggota;
        int diskon2;
        double diskon = 0.9, totalHarga, bayar, harga;
        String nama;
       
       do{
        Scanner masuk = new Scanner(System.in);
        System.out.println("====SELAMAT DATANG====");
            System.out.print("Silakan masukkan nama anda : ");
            nama = masuk.next();
            System.out.print("Silakan masukkan jumlah barang : ");
            jml = masuk.nextInt();
            System.out.print("Silakan masukkan harga : Rp ");
            harga = masuk.nextDouble();
            System.out.println("Apakah punya kartu member?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Jawab : ");
            anggota = masuk.nextInt();
            
            totalHarga = jml * harga;
            
            if(anggota == 1){
                if(totalHarga < 1000000){
                    System.out.println(totalHarga);    
                }else
                    System.out.println((totalHarga * diskon) * diskon);
            }else
                if(totalHarga < 1000000)
                    System.out.println(totalHarga);
            else
                    System.out.println(totalHarga * diskon);
            
            
            System.out.println("Ulangi program?");
            System.out.println("1=y, 2=n");
            System.out.print("Jawab : ");
            ulangi = masuk.nextInt();
            
    } while (ulangi == 1);
    System.out.println("Teima kasih");
            
}        
}              
            
    

