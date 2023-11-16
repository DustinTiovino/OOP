package Tugas1;

public class Barang {
    String kodeBarang;
    String namaBarang;
    String gudang;
    double hargaBeli;
    double hargaJual;

    public Barang(String kodeBarang, String namaBarang, String gudang, double hargaBeli, double hargaJual) throws HargaJualExc{
        if (hargaJual <= 0) {
            throw new HargaJualExc("Harga jual harus lebih besar dari nol");
        }
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.gudang = gudang;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
    }
    
    public void beliBarang(int jumlahPembelian) throws JumlahPembelianExc{
        if(jumlahPembelian < 1) {
            throw new JumlahPembelianExc("Jumlah pembelian barang minimal 1");
        }
    }
}