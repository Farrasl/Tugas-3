
package StudiKasusInheritance;

public class dataPembeli extends dataBarang {
    public String idpembeli, namapembeli, alamat, telp;
    
    dataPembeli(String idpembeli, String namapembeli, String alamat, String telp,
                String barang1, String barang2, String idBarang, String kasir){
        super(barang1, barang2, idBarang, kasir);
        this.idpembeli = idpembeli;
        this.namapembeli = namapembeli;
        this.alamat = alamat;
        this.telp = telp;            
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("ID Pembeli    : " + idpembeli);
        System.out.println("Nama Pembeli  : " + namapembeli);
        System.out.println("Alamat        : " + alamat);
        System.out.println("No. Telepon   : " + telp);
        System.out.println("===============================");
    }
}
