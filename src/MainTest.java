import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

    @Test
    void formatFull() {
        String result = Main.formatFull(dateTime);
        assertEquals("venerdì 1 marzo 2002 13:00:00 Z", result);
    }

    @Test
    void formatMedium() {
        String result = Main.formatMedium(dateTime);
        assertEquals("1 mar 2002, 13:00:00", result);
    }

    @Test
    void formatShort() {
        String result = Main.formatShort(dateTime);
        assertEquals("01/03/02, 13:00", result);
    }
}