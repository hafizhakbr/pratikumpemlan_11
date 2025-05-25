import java.io.File;

public class UkuranFile {
    public static void main(String[] args) {
        var file = new File("pertemuan 1 (CLASS AND OBJECT).pdf");
        
        if (file.exists()) {
            long UkuranBytes = file.length();
            double SatuanKB = UkuranBytes / 1024.0;
            double SatuanMB = SatuanKB / 1024.0;
            
            if (SatuanMB >= 1) {
                System.out.printf("Ukuran file: %.2f MB\n", SatuanMB);
            } else {
                System.out.printf("Ukuran file: %.2f KB\n", SatuanKB);
            }
        } else {
            System.out.println("File tidak ditemukan");
        }
    }
}