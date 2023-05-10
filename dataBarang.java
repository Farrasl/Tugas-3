
package StudiKasusInheritance;

public class dataBarang {
    public String barang1, barang2, idBarang, kasir;
    private int harga1, harga2;
    
    dataBarang(String barang1, String barang2, String idBarang, String kasir){
        this.barang1 = barang1;
        this.barang2 = barang2;
        this.idBarang = idBarang;
        this.kasir = kasir;
    }
    
    public void setHarga1(int harga1){
        this.harga1 = harga1;
    }
    
    int getHarga1(){
        return harga1;
    }
    
    public void setHarga2(int harga2){
        this.harga2 = harga2;
    }
    
    int getHarga2(){
        return harga2;
    }
   
    void info(){
        System.out.println("Nota Pembelian Toko Makmur Abadi");
        System.out.println("===============================");
        System.out.println("Kasir         : " + kasir);
        System.out.println("Tanggal       : 11/04/2023");
        System.out.println("===============================");
        System.out.println("ID Barang     : "  + idBarang);
        System.out.println("Nama Barang 1 : " + barang1);
        System.out.println("Harga         : Rp" + harga1);
        System.out.println("Nama Barang 2 : " + barang2);
        System.out.println("Harga         : Rp" + harga2);
        System.out.println("===============================");
        System.out.println("Total Harga   : Rp" + (getHarga1() + getHarga2()));
        System.out.println("===============================");
    }
}