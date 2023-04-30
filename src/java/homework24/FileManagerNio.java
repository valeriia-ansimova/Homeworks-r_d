package homework24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManagerNio {

    public void saveToFile(String fileName, String fileContent) throws IOException {
        Files.writeString(Path.of(fileName), fileContent);
    }

    public String readFromFile(String fileName) throws IOException {
        return Files.readString(Path.of(fileName));
    }
}
