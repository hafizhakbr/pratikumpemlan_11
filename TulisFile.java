                                                                                // mengimpor class FileWriter untuk menulis ke file
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisFile {
                                                                                // method utama yang akan dijalankan pertama kali
    public static void main(String[] args) {
                                                                                // membuat objek Scanner untuk membaca input dari keyboard
        var keyboard = new Scanner(System.in);
                                                                                // menampilkan pesan ke layar untuk meminta input dari pengguna
        System.out.print("Masukkan teks yang akan disimpan: ");
                                                                                // membaca satu baris teks yang diketikkan pengguna
        var text = keyboard.nextLine();
                                                                                // blok try-with-resources: mencoba membuka file "test.txt" dengan mode append (tambahkan di akhir file)
        try (var writer = new FileWriter("test.txt", true)) {
                                                                                // menulis teks yang dimasukkan pengguna ke dalam file
            writer.write(text);
            writer.write(System.lineSeparator());                               // menambahkan baris baru setelah teks agar tidak menyambung dengan tulisan sebelumnya
        } catch (IOException e) {
                                                                                // jika terjadi kesalahan saat menulis ke file, tampilkan pesan error
            System.err.println("Gagal menulis ke file");
        }
    }
}
