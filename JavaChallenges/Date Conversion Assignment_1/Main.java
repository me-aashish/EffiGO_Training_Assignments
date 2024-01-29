import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the date time string : ");
        Scanner sc = new Scanner(System.in);
        String dateTimeString = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        try {
            // IST --> UNIX
            java.util.Date utilDate = dateFormat.parse(dateTimeString);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            long unixTimestamp = sqlDate.getTime();
            System.out.println("Unix Timestamp is : " + unixTimestamp);

            // IST --> UTC
            LocalDateTime localDateTimeIST = LocalDateTime.parse(dateTimeString, formatter);
            ZoneId zoneIdIST = ZoneId.of("Asia/Kolkata");
            ZoneId zoneIdUTC = ZoneId.of("UTC");
            LocalDateTime utcDateTime = localDateTimeIST.atZone(zoneIdIST).withZoneSameInstant(zoneIdUTC)
                    .toLocalDateTime();

            String utcTime = utcDateTime.format(formatter);
            System.out.println("UTC Date-Time: " + utcTime);

            // UTC --> IST
            LocalDateTime localDateTimeUTC = LocalDateTime.parse(utcTime, formatter);
            LocalDateTime istDateTime = localDateTimeUTC.atZone(zoneIdUTC).withZoneSameInstant(zoneIdIST)
                    .toLocalDateTime();
            String istTime = istDateTime.format(formatter);
            System.out.println("ISt Date-Time: " + istTime);

        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
