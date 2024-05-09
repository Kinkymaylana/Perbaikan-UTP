// Subkelas yang merepresentasikan tiket VVIP (Unlimited Experience)
class VVIP extends TiketKonser {
    @Override
    public String getNamaTiket() {
        return "UNLIMITED EXPERIENCE"; // Mengembalikan nama tiket
    }

    @Override
    public double getHargaTiket() {
        return 11000000; // Mengembalikan harga tiket
    }
}