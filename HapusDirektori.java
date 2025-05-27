import java.io.File;                                                                        // mengimpor kelas File dari paket java.io untuk bekerja dengan file dan direktori.

public class HapusDirektori {                                                               // mendefinisikan kelas publik bernama HapusDirektori.
    public static void main(String[] args) {                                                // metode utama (main method) yang akan dieksekusi saat program dijalankan.
                                                                                            // membuat objek File yang merepresentasikan direktori "nama_folder".
                                                                                            // ganti "nama_folder" dengan nama direktori yang ingin Anda hapus.
        var direktori = new File("nama_folder");
                                                                                            // memeriksa apakah objek 'direktori' benar-benar ada di sistem file DAN apakah itu adalah sebuah direktori (bukan file).
        if (direktori.exists() && direktori.isDirectory()) {
                                                                                            // jika direktori ditemukan dan itu memang sebuah direktori,
                                                                                            // maka dapatkan daftar semua file dan sub-direktori di dalamnya.
                                                                                            // hasilnya adalah array dari objek File.
            File[] files = direktori.listFiles();
                                                                                            // melakukan iterasi (perulangan) melalui setiap objek File dalam array 'files'.
                                                                                            // ini akan menghapus semua file di dalam direktori sebelum direktori itu sendiri dihapus.
            for (File file : files) {
                                                                                            // memeriksa apakah objek 'file' saat ini adalah sebuah file (bukan sub-direktori).
                if (file.isFile()) {
                                                                                            // mencoba menghapus file. Metode delete() mengembalikan true jika berhasil, false jika gagal.
                    if (!file.delete()) {
                                                                                            // jika penghapusan file gagal, tampilkan pesan kesalahan ke konsol.
                        System.out.println("Gagal menghapus file: " + file.getName());
                    }
                }
            }
                                                                                            // setelah semua file di dalam direktori dihapus (atau jika tidak ada file),
                                                                                            // coba hapus direktori itu sendiri. Direktori harus kosong untuk bisa dihapus.
            if (direktori.delete()) {
                                                                                            // jika penghapusan direktori berhasil, tampilkan pesan sukses.
                System.out.println("Direktori berhasil dihapus.");
            } else {
                                                                                            // jika penghapusan direktori gagal (misalnya, masih ada sub-direktori atau file yang tidak terhapus),
                                                                                            // tampilkan pesan kegagalan.
                System.out.println("Gagal menghapus direktori.");
            }
        } else {                                                                            // jika kondisi direktori.exists() && direktori.isDirectory() adalah false (direktori tidak ditemukan atau bukan direktori).
            System.out.println("Direktori tidak ditemukan.");                             // menampilkan pesan bahwa direktori tidak ditemukan.
        }
    }
}
