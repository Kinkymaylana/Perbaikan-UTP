import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Kelas utama yang berisi metode main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari konsol
        System.out.println("\nSelamat datang di Pemesanan Tiket!"); // Mencetak pesan selamat datang
        System.out.print("Masukkan nama pemesan: "); // Meminta pengguna untuk memasukkan nama mereka
        String namaPemesan = scanner.nextLine(); // Membaca nama yang dimasukkan

        // Menampilkan opsi tiket untuk pengguna memilih
        System.out.println("Pilih jenis tiket:");
        System.out.println("1. CAT 8");
        System.out.println("2. CAT 1");
        System.out.println("3. FESTIVAL");
        System.out.println("4. VIP");
        System.out.println("5. UNLIMITED EXPERIENCE");
        System.out.print("Masukkan pilihan: "); // Meminta pengguna untuk memilih jenis tiket
        int pilihan = scanner.nextInt(); // Membaca jenis tiket yang dimasukkan

        TiketKonser tiket = null; // Mendeklarasikan objek TiketKonser untuk menyimpan tiket yang dipilih

        // Switch statement untuk menginisialisasi objek tiket yang sesuai berdasarkan pilihan pengguna
        switch (pilihan) {
            case 1:
                tiket = new CAT8();
                break;
            case 2:
                tiket = new CAT1();
                break;
            case 3:
                tiket = new FESTIVAL();
                break;
            case 4:
                tiket = new VIP();
                break;
            case 5:
                tiket = new VVIP();
                break;
            default:
                System.out.println("Pilihan tidak valid."); // Mencetak pesan untuk pilihan tidak valid
                System.exit(0); // Mengakhiri program
        }

        // Membuat objek PemesananTiket baru dengan nama pengguna dan tiket yang dipilih
        PemesananTiket pemesanan = new PemesananTiket(namaPemesan, tiket);
        pemesanan.cetakDetailPemesanan(); // Mencetak detail pemesanan
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan kode pesanan atau kode booking
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}
