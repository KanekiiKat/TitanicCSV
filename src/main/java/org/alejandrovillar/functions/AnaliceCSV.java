package org.alejandrovillar.functions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnaliceCSV {



    public static List<String[]> analiceCSV(Path pathCSV) throws IOException {
        List<String> linesCSV = Files.readAllLines(pathCSV);
        linesCSV.removeFirst();

        return linesCSV.stream()
                .map(s -> s.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1))
                .collect(Collectors.toList());
    }
}
