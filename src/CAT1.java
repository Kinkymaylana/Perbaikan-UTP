// Subkelas yang merepresentasikan tiket CAT 1
class CAT1 extends TiketKonser {
    @Override
    public String getNamaTiket() {
        return "CAT 1"; // Mengembalikan nama tiket
    }

    @Override
    public double getHargaTiket() {
        return 10000000; // Mengembalikan harga tiket
    }
}