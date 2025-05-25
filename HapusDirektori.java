import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        var direktori = new File("nama_folder");

        if (direktori.exists() && direktori.isDirectory()) {
            File[] files = direktori.listFiles();
            
            for (File file : files) {
                if (file.isFile()) {
                    if (!file.delete()) {
                        System.out.println("Gagal menghapus file: " + file.getName());
                    }
                }
            }

            if (direktori.delete()) {
                System.out.println("Direktori berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus direktori.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}