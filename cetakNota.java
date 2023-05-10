
package StudiKasusInheritance;

public class cetakNota {
    public static void main(String[] args) {
          dataPembeli p = new dataPembeli("001", "Zaki", "Jl. Garuda Sakti", "087868685950",
   "Buku Paperline", "Penggaris", "011", "Farras" );
   
   p.setHarga1(5000);
   p.setHarga2(2500);
   p.info(); 
    }
}