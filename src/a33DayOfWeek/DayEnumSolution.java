package a33DayOfWeek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DayEnumSolution {

    public static void main(String[] args) {

        int day = 31;
        int month = 8;
        int year = 2019;
        System.out.println(dayOfTheWeek(day, month, year));
    }


    static String dayOfTheWeek(int day, int month, int year) {
        // Formatear la cadena de fecha
        String fechaStr = String.format("%04d-%02d-%02d", year, month, day);
        System.out.println(fechaStr);

        // Analizar la cadena de fecha para obtener un objeto LocalDate
        LocalDate fecha = LocalDate.parse(fechaStr, DateTimeFormatter.ISO_LOCAL_DATE);

        // Obtener el día de la semana como un objeto DayOfWeek
        DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();

        // Devolver el día de la semana como una cadena
        return diaDeLaSemana.toString();
    }

    enum daysWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }




}