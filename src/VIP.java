// Subkelas yang merepresentasikan tiket VIP
class VIP extends TiketKonser {
    @Override
    public String getNamaTiket() {
        return "VIP"; // Mengembalikan nama tiket
    }

    @Override
    public double getHargaTiket() {
        return 8000000; // Mengembalikan harga tiket
    }
}