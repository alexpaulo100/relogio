package br.com.relogio;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClockConversionTest {

    @Test
    void shouldConvertBRClockToUSClock() {
        Clock brClock = new BRLClock();
        brClock.setHour(23);
        brClock.setMinute(0);
        brClock.setSecond(0);

        USClock usClock = (USClock) new USClock().convert(brClock);

        assertEquals(11, usClock.getHour());
        assertEquals(Period.PM, usClock.getPeriod());
        assertEquals("11:00:00 PM", usClock.getTime());
    }
}
