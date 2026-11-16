package com.campusdual.iofiles;

import com.campusdual.Utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class Writer {

    static void main() {
        java.nio.file.Path path = Paths.get(Path.PATH_NAME);
        try (PrintWriter pw = new PrintWriter(new FileWriter(path.toFile()))){
            for (int i = 0; i < 10; i++) {
                pw.println(Utils.getRandomNumberInRange(1,100));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
