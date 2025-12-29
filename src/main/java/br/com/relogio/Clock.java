package br.com.relogio;

public sealed abstract class Clock permits BRLClock, USClock{

    protected int hour;

    protected int minute;

    protected int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour == 24) {
            this.hour = 0;
            return;
        }

        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hour);
        }

        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minute);
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 60){
            this.second = 60;
            return;
        }
        this.second = second;
    }

    private String format(int value){
        return value < 9 ?"0" + value : String.valueOf(value);
    }

    public String getTime(){
        return format(hour) + ":" + format(minute) + ":" + format(second);
    }
    abstract Clock convert(Clock clock);
}
