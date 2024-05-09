// Kelas untuk merepresentasikan pemesanan tiket
class PemesananTiket {
    public String namaPemesan; // Nama orang yang melakukan pemesanan
    public String kodeBooking; // Kode pemesanan
    public String tanggalPesanan; // Tanggal pemesanan
    public TiketKonser tiket; // Jenis tiket yang dipesan

    // Konstruktor untuk menginisialisasi detail pemesanan
    public PemesananTiket(String namaPemesan, TiketKonser tiket) {
        this.namaPemesan = namaPemesan; // Menginisialisasi nama orang
        this.tiket = tiket; // Menginisialisasi jenis tiket
        this.kodeBooking = Main.generateKodeBooking(); // Menghasilkan kode pemesanan
        this.tanggalPesanan = Main.getCurrentDate(); // Mendapatkan tanggal saat ini
    }

    // Metode untuk mencetak detail pemesanan
    public void cetakDetailPemesanan() {
        System.out.println("\n----- Detail Pemesanan -----");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Kode Booking: " + kodeBooking);
        System.out.println("Tanggal Pesanan: " + tanggalPesanan);
        System.out.println("Tiket yang dipesan: " + tiket.getNamaTiket());
        System.out.println("Total harga: " + tiket.getHargaTiket() + " USD\n");
    }
}