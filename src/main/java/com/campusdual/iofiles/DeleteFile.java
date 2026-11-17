package com.campusdual.iofiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    static void main() {
        Path path = Paths.get(Route.ROUTE_NAME);
        try {
            Files.deleteIfExists(path);
            System.out.println("File deleted.");
        } catch (IOException e) {
            System.out.println("There was an error deleting " + path.getFileName() );
        }

    }
}
