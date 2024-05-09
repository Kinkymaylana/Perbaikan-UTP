// Subkelas yang merepresentasikan tiket Festival
class FESTIVAL extends TiketKonser {
    @Override
    public String getNamaTiket() {
        return "FESTIVAL"; // Mengembalikan nama tiket
    }

    @Override
    public double getHargaTiket() {
        return 5000000; // Mengembalikan harga tiket
    }
}