package org.alejandrovillar.functions;

import org.alejandrovillar.values.Titanic;

import java.util.ArrayList;
import java.util.List;

public class TitanicBuilder {

    public TitanicBuilder(){}

    public List<Titanic> buildTitanic(List<String[]> lines) {
        List<Titanic> titanicList = new ArrayList<>();
        for (String[] columna : lines) {
            titanicList.add(new Titanic(
                    columna[0], columna[1], columna[2], columna[3],
                    columna[4], columna[5], columna[6], columna[7],
                    columna[8], columna[9], columna[10], columna[11]
            ));
        }
        return titanicList;



    }




}
