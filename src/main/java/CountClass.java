import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class CountClass {
    static List ignorInit(){
    List<DayOfWeek> ignore = new ArrayList<>();
        ignore.add(DayOfWeek.MONDAY);
        ignore.add(DayOfWeek.TUESDAY);
        ignore.add(DayOfWeek.WEDNESDAY);
        ignore.add(DayOfWeek.THURSDAY);
        ignore.add(DayOfWeek.FRIDAY);
    return ignore;
    }
    public static long totalDays(LocalDate start, LocalDate end, List<DayOfWeek> ignore){
        return daysBetween(start,end,ignore)+1;
    }
    static long daysBetween(LocalDate start, LocalDate end, List<DayOfWeek> ignore) {
        return Stream.iterate(start, d->d.plusDays(1))
                .limit(start.until(end, ChronoUnit.DAYS))
                .filter(d->!ignore.contains(d.getDayOfWeek()))
                .count();
    }
    static void getDay(){
        LocalDate localDate = LocalDate.of(1977, 05, 25);
        String dateInEnglish = localDate.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy", Locale.getDefault()));
        System.out.println("It was : " + dateInEnglish);
    }
}
