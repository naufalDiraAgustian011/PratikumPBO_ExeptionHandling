import java.util.InputMismatchException;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        String n = "lanjut";
        Integer hargaBarang = 0;
        Integer jumlahBarang = 0;
        Integer noKasir = 0;

        


        while(n.equals("lanjut")){
            boolean input = false;
            Scanner masuk = new Scanner(System.in);
            Scanner Angka = new Scanner(System.in);
            System.out.print("nama Pelanggan   : ");
            String nama = masuk.nextLine();
            Scanner inputAlamat = new Scanner(System.in);
            System.out.print("Alamat           : ");
            String alamat = inputAlamat.nextLine();
            System.out.print("Code barang      : ");
            String kodeBarang = masuk.next();
            System.out.print("Nama Barang      : ");
            String namaBarang = masuk.next();
            System.out.print("Harga Barang     : ");
            hargaBarang = Angka.nextInt();
            System.out.print("Jumlah Barang    : ");
            jumlahBarang = Angka.nextInt();

            input = false;
            int check = 0;
                do{
                        if(check>0)
                            System.out.println("Input ulang !!!");
                    check++;
                    try {
                        
                        System.out.println("No Kasir         : (1-3)");
                        noKasir = Angka.nextInt();
                        input = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Masukkan Bilangan !!!");
                        Angka.next();}
                }while(!input || noKasir>3 || noKasir<=0); 
            
            
            
            Penjualan penjualan  = new Penjualan(nama, alamat, kodeBarang, namaBarang, hargaBarang, jumlahBarang, noKasir-1);

            Scanner cout = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("ketik lanjut untuk melanjutkan");
            n = cout.next();
            System.out.println();
        }
    }
}