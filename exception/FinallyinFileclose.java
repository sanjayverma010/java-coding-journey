import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyinFileclose {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("c:desktop/thisfile");
        } catch (FileNotFoundException e) {
            System.out.println("File not found exeption" + e);
        } finally {
            if (fis != null) {
                fis.close();
            }
            System.out.println("file cloised");
        }

    }
}
