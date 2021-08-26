package dataTypes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattedLocalTime {

    public static String getTime() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        return dtf.format(localTime);
    }
}
