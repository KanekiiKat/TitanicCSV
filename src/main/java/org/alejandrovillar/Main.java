package org.alejandrovillar;

import org.alejandrovillar.functions.AnaliceCSV;
import org.alejandrovillar.values.Titanic;
import org.alejandrovillar.functions.TitanicBuilder;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
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

            System.out.println("¿Cuántos pasajeros en total han sobrevivido?\nOrdenados por clase: ");
            titanics.stream().filter(e -> e.getSurvived().equals("1")).collect(Collectors.groupingBy(Titanic::getPclass, Collectors.counting())).entrySet().stream().forEach(System.out::println);
            System.out.println("Ordenados por sexo: ");
        titanics.stream().filter(e -> e.getSurvived().equals("1")).collect(Collectors.groupingBy(Titanic::getSex, Collectors.counting())).entrySet().stream().forEach(System.out::println);

        // ¿Cuál fue el puerto de embarque más común? ¿Hay relación entre el puerto de embarque y la supervivencia?
        System.out.println("¿Cuál fue el puerto de embarque más común? ");
        titanics.stream().collect(Collectors.groupingBy(Titanic::getEmbarked, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println(e.getKey()));

        System.out.println("¿Hay relación entre el puerto de embarque y la supervivencia? ");

        titanics.stream().filter(e -> e.getEmbarked().equals("S"))
                .filter(e -> e.getSurvived().equals("1"))
                .collect(Collectors.groupingBy(Titanic::getEmbarked, Collectors.counting()))
                .entrySet()
                .forEach(p -> System.out.println("De la puerta " + p.getKey() + " sobrevivieron " + p.getValue()));

        titanics.stream().filter(e -> e.getEmbarked().equalsIgnoreCase("S")).filter(e -> e.getSurvived().equals("1")).collect(Collectors.groupingBy(Titanic::getEmbarked, Collectors.counting())).entrySet().stream().forEach(System.out::println);

        System.out.println( "Número de supervivientes totales: " + titanics.stream().filter(s -> s.getSurvived().equals("1")).count());

        // ¿Cuál fue la tasa de supervivencia de los niños (menores de 12 años) en comparación con los adultos?

        System.out.println("¿Cuál fue la tasa de supervivencia de los niños (menores de 12 años) en comparación con los adultos? \n");



        int jovenesSupervivientes = titanics.stream().filter(n -> !n.getAge().isEmpty()).filter(n -> ((int) Double.parseDouble(n.getAge())) < 12).filter(s -> s.getSurvived().equals("1")).toList().size();
        int adultosSupervivientes = titanics.stream().filter(n -> !n.getAge().isEmpty()).filter(n -> ((int) Double.parseDouble(n.getAge())) >= 12).filter(s -> s.getSurvived().equals("1")).toList().size();

        System.out.println("Los niños supervivientes son " + jovenesSupervivientes + " y los adultos supervivientes son " + adultosSupervivientes + ", la diferencia de supervivientes es de " + (adultosSupervivientes - jovenesSupervivientes) + " (Quitando la gente q su edad es desconocida).");
    }
}
