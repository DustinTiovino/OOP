package Tugas1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan kode barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan nama barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan gudang: ");
            String gudang = scanner.nextLine();

            System.out.print("Masukkan harga beli: ");
            double hargaBeli = scanner.nextDouble();

            System.out.print("Masukkan harga jual: ");
            double hargaJual = scanner.nextDouble();

            Barang barang = new Barang(kodeBarang, namaBarang, gudang, hargaBeli, hargaJual);

            System.out.print("Masukkan jumlah pembelian: ");
            int jumlahPembelian = scanner.nextInt();

            barang.beliBarang(jumlahPembelian);

            System.out.println("Data barang telah diinput");
        } catch (HargaJualExc e) {
            System.out.println(e.getMessage());
        } catch (JumlahPembelianExc e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
