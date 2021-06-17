package common;

import java.time.*;
import java.text.*;
import java.time.format.DateTimeFormatter;

public class Time {
    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static String getTime(){
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static Long getMilli(){
        return Instant.now().toEpochMilli();
    }
}