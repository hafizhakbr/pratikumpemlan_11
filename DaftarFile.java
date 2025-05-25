import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        var direktori = new File("GUIHafizh");

        if (direktori.exists() && direktori.isDirectory()) {
            File[] listFile = direktori.listFiles();

            for (File file : listFile) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}