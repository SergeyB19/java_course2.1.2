package work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader
                (new FileReader("\\C:\\Users\\serge\\Desktop\\JavaImage.png"));

             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("JavaImage.png"));
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
        /*    String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write('\n');
            }*/
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
