package br.com.relogio;

import java.util.Objects;

public non-sealed class USClock extends Clock {

    private Period period;

    public Period getPeriod() {
        return period;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hour);
        }

        if (hour < 12) {
            period = Period.AM;
            this.hour = (hour == 0) ? 12 : hour;
        } else {
            period = Period.PM;
            this.hour = (hour == 12) ? 12 : hour - 12;
        }
    }

    @Override
    Clock convert(final Clock clock) {
        Objects.requireNonNull(clock, "Clock não pode ser null");

        setSecond(clock.getSecond());
        setMinute(clock.getMinute());

        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.period = usClock.getPeriod();
            }
            case BRLClock brlClock -> setHour(brlClock.getHour());
        }

        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + period;
    }
}
