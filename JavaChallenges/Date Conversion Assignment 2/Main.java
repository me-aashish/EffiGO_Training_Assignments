import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IST date in the format dd/MM/yyyy HH:mm :");
        String istInput = sc.nextLine();

        // Plus one day to IST
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        try {
            // Add 1 day
            LocalDateTime istDateTime = LocalDateTime.parse(istInput, formatter);
            LocalDateTime istDateTimePlusOneDay = istDateTime.plusDays(1);
            System.out.println("Input IST Date: " + istDateTime.format(formatter));
            System.out.println("IST Date-Time after adding 1 day: " + istDateTimePlusOneDay.format(formatter));

            // Subtract 10 days
            LocalDateTime resultDateTime = istDateTime.minus(10, ChronoUnit.DAYS);
            System.out.println("IST Date-Time after subtracting 10 days: " + resultDateTime.format(formatter));

            // Add 1 hour
            LocalDateTime updatedDateTime = istDateTime.plusHours(1);
            System.out.println("IST Date-Time after adding 1 hour: " + updatedDateTime.format(formatter));

            // Substract 5 hours, 30 mins
            LocalDateTime newDateTime = istDateTime.minusHours(5).minusMinutes(30);
            System.out
                    .println("IST Date-Time after subtracting 5 hour and 30 minutes: " + newDateTime.format(formatter));

            // sort on the basis of timestamp

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
