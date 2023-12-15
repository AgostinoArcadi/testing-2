import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

        System.out.println("Full: " + formatFull(dateTime));

        System.out.println("Medium: " + formatMedium(dateTime));

        System.out.println("Short: " + formatShort(dateTime));
    }

    public static String formatFull(ZonedDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
    }

    public static String formatMedium(ZonedDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }

    public static String formatShort(ZonedDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
    }
}
