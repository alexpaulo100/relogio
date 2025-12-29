package br.com.relogio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class USClockTest {

    @Test
    void shouldConvertMidnightCorrectly() {
        USClock clock = new USClock();
        clock.setHour(0);

        assertEquals(12, clock.getHour());
        assertEquals(Period.AM, clock.getPeriod());
        assertEquals("12:00:00 AM", clock.getTime());
    }

    @Test
    void shouldConvertAfternoonHourCorrectly() {
        USClock clock = new USClock();
        clock.setHour(15);

        assertEquals(3, clock.getHour());
        assertEquals(Period.PM, clock.getPeriod());
    }

    @Test
    void shouldThrowExceptionForInvalidHour() {
        USClock clock = new USClock();

        assertThrows(IllegalArgumentException.class,
                () -> clock.setHour(25));
    }

    @Test
    void shouldThrowExceptionWhenMinuteIsInvalid() {
        Clock clock = new USClock();

        assertThrows(IllegalArgumentException.class, () -> {
            clock.setMinute(60);
        });
    }
    @Test
    void deveConverter24ParaZeroHora() {
         Clock clock = new BRLClock();

         clock.setHour(24);
         clock.setMinute(0);
         clock.setSecond(0);

         assertEquals(0, clock.getHour());



    }

}
