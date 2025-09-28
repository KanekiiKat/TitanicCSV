package org.alejandrovillar;

import org.alejandrovillar.functions.AnaliceCSV;
import org.alejandrovillar.values.Titanic;
import org.alejandrovillar.functions.TitanicBuilder;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws IOException {

        TitanicBuilder builder = new TitanicBuilder();

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo: ");
        String pathString = sc.nextLine();

        List<String[]> listaTitanic = AnaliceCSV.analiceCSV(Path.of(pathString));

        List<Titanic> titanics  = builder.buildTitanic(listaTitanic);


        // ¿Cuántos pasajeros en total han sobrevivido? Clasifícalos por clase y sexo.



        // ¿Cuál fue el puerto de embarque más común? ¿Hay relación entre el puerto de embarque y la supervivencia?



        // ¿Cuál fue la tasa de supervivencia de los niños (menores de 12 años) en comparación con los adultos?




    }
}
