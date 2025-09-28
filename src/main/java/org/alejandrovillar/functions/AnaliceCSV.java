package org.alejandrovillar.functions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AnaliceCSV {



    public static List<String[]> analiceCSV(Path pathCSV) throws IOException {
        List<String> linesCSV = Files.readAllLines(pathCSV);

        linesCSV.removeFirst();


        return linesCSV.stream().map(linea -> linea.replace('"', ' ').split(",", -1)).toList();

    }
}
