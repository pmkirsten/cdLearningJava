package com.campusdual.iofiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader {
    static void main() {
        Path path = Paths.get(Route.ROUTE_NAME);
        try(BufferedReader br = new BufferedReader(new FileReader(path.toFile()))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
