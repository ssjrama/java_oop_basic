public class Beasiswa extends Pembayaran implements TampilBayar{    
    public int beasiswa;

    // override 
    public int jumlahBayar(){
        return this.ukt - this.beasiswa;
    }

    // overload
    public int jumlahBayar(int bantuan){
        return this.ukt - this.beasiswa - bantuan;
    }

    // interface
    public void tampilBayar(){
        System.out.println("\nJumlah pembayaran UKT anda : " + this.jumlahBayar());
    }

    public void tampilBayar(int bantuan){
        System.out.println("\nJumlah pembayaran UKT anda : " + this.jumlahBayar(bantuan));
    }
}