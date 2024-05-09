// Subkelas yang merepresentasikan tiket CAT 8
public class CAT8 extends TiketKonser {
    @Override
    public String getNamaTiket() {
        return "CAT 8"; // Mengembalikan nama tiket
    }

    @Override
    public double getHargaTiket() {
        return 3000000; // Mengembalikan harga tiket
    }
}
