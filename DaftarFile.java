import java.io.File;                                            // mengimpor kelas File dari paket java.io untuk operasi file dan direktori

public class DaftarFile {                                       // deklarasi kelas utama bernama DaftarFile

    public static void main(String[] args) {                    // method main sebagai entry point program
        var direktori = new File("GUIHafizh");                  // membuat objek File yang merepresentasikan direktori "GUIHafizh"
        if (direktori.exists() && direktori.isDirectory()) {    // memeriksa apakah direktori tersebut ada DAN benar-benar sebuah direktori
            File[] listFile = direktori.listFiles();            // mendapatkan array dari semua file dan subdirektori dalam direktori ini
  
            for (File file : listFile) {                        // loop for-each untuk iterasi melalui semua elemen dalam array listFile
                if (file.isFile()) {                            // memeriksa apakah elemen saat ini adalah file (bukan direktori)
                    System.out.println(file.getName());         // menampilkan nama file ke konsol
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");   // menampilkan pesan jika direktori tidak ditemukan atau bukan direktori
        }
    }
}
