import java.io.File;                                                            // mengimpor kelas File dari paket java.io untuk bekerja dengan file dan direktori.

public class UkuranFile {                                                       // mendefinisikan kelas publik bernama UkuranFile.
    public static void main(String[] args) {                                    // metode utama (main method) yang akan dieksekusi saat program dijalankan.
                                                                                // membuat objek File yang merepresentasikan file "pertemuan 1 (CLASS AND OBJECT).pdf".
                                                                                // pastikan file ini berada di direktori yang sama dengan program Java yang dijalankan,
                                                                                // atau berikan path absolut ke file tersebut.
        var file = new File("pertemuan 1 (CLASS AND OBJECT).pdf");

        if (file.exists()) {                                                    // memeriksa apakah file yang direpresentasikan oleh objek 'file' benar-benar ada di sistem.
            long UkuranBytes = file.length();                                   // mendapatkan ukuran file dalam byte (tipe data long) dan menyimpannya di variabel UkuranBytes.
            double SatuanKB = UkuranBytes / 1024.0;                             // mengubah ukuran dari byte ke kilobyte (KB) dengan membagi 1024.0 (menggunakan .0 untuk hasil double).
            double SatuanMB = SatuanKB / 1024.0;                                // mengubah ukuran dari kilobyte (KB) ke megabyte (MB) dengan membagi 1024.0.

            if (SatuanMB >= 1) {                                                // memeriksa apakah ukuran file dalam megabyte lebih besar atau sama dengan 1.
                                                                                // jika ya, tampilkan ukuran file dalam megabyte dengan dua angka di belakang koma.
                System.out.printf("Ukuran file: %.2f MB\n", SatuanMB);
            } else {
                                                                                // jika tidak (ukuran kurang dari 1 MB), tampilkan ukuran file dalam kilobyte dengan dua angka di belakang koma.
                System.out.printf("Ukuran file: %.2f KB\n", SatuanKB);
            }
        } else {                                                                // jika kondisi file.exists() adalah false (file tidak ditemukan).
            System.out.println("File tidak ditemukan");                       // menampilkan pesan bahwa file tidak ditemukan.
        }
    }
}
