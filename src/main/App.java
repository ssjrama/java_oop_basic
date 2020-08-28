package main;
import beasiswa.*;

public class App {
    public static void main(String[] args) throws Exception {
        Beasiswa beasiswa = new Beasiswa();
        beasiswa.beasiswa = 1000000;
        beasiswa.jumlahBayar();
        beasiswa.jumlahBayar(500000);
        beasiswa.tampilBayar();
        beasiswa.tampilBayar(500000);
    }
}
