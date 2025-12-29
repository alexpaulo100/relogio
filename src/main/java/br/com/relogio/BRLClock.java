package br.com.relogio;

import java.util.Objects;

public non-sealed class BRLClock extends Clock {

    @Override
    public Clock convert(final Clock clock) {
        Objects.requireNonNull(clock, "Clock não pode ser null");

        setSecond(clock.getSecond());
        setMinute(clock.getMinute());

        switch (clock) {
            case USClock usClock -> setHour(convertUSTo24(usClock));
            case BRLClock brlClock -> setHour(brlClock.getHour());
        }

        return this;
    }

    private int convertUSTo24(USClock usClock) {
        int hour = usClock.getHour();
        Period period = usClock.getPeriod();

        if (period == Period.AM) {
            return hour == 12 ? 0 : hour;
        } else { // PM
            return hour == 12 ? 12 : hour + 12;
        }
    }
}
