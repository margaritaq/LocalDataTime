import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {
        ZoneId Syd = ZoneId.of("Australia/Sydney");
        ZoneId los = ZoneId.of("America/Los_Angeles");
        LocalDateTime dateTime = LocalDateTime.of(2019, 11, 11, 11, 15);
        LocalDateTime dateTime2 = LocalDateTime.of(2019, 11, 11, 6, 0);
        ZonedDateTime SydDateTime = ZonedDateTime.of(dateTime, Syd);
        ZonedDateTime losDateTime2 = ZonedDateTime.of(dateTime2, los);
        Duration duration = Duration.between(SydDateTime, losDateTime2);
        System.out.println(duration);
        System.out.println("...................................");



        LocalDate start = LocalDate.of(1977, 05, 25);
        LocalDate end = LocalDate.of(1977, 05, 25).plusYears(2);
        CountClass.getDay();
        System.out.println("Total was played: " + CountClass.totalDays(start,end,CountClass.ignorInit())+" times.");
    }


    }



