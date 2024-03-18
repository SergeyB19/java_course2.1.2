package work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream inputStream
                     = new FileInputStream("\\C:\\Users\\serge\\Desktop\\JavaImage.png");
             FileOutputStream outputStream = new FileOutputStream("JavaImage.png");
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done");
        }
    }
}
