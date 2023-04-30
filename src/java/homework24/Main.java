package homework24;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "fileNio";
        String fileContent = "New content 33";

        FileManagerNio fileManagerNio = new FileManagerNio();
        fileManagerNio.saveToFile(fileName, fileContent);

        String content = fileManagerNio.readFromFile(fileName);
        System.out.println(content);
    }
}
