package kemia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Kemia {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("felfedezesek.csv");
        List<String> sorok = Files.readAllLines(path);
        List<KemiaiElem> elemek = new ArrayList<>();
    }
    
}
