public class Observation {
    private double value;
    private int hour;
    private int minute;

    public Observation(double value, int hour, int minute) {
        this.value = value;
        this.hour = hour;
        this.minute = minute;
    }

    public double getValue() {
        return value;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
