package Section13;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;
import java.util.regex.Pattern;

public class Exe13_15 {

public static void giveDate(){

    LocalDate date = LocalDate.of(2020, 04,5);
    System.out.println(date);

    DateTimeFormatter formatt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    String formatDate = formatt.format(date);
    System.out.println(formatDate);



}
}
