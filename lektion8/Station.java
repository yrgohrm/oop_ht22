import java.time.LocalTime;

public class Station {
    private int hour;
    private int min;

    private Observation obs;

    public Observation getObservation() {
        LocalTime lt = LocalTime.now();

        if (hour != obs.getHour() || min != obs.getMinute()) {
            this.obs = new Observation(12.45, lt.getHour(), lt.getMinute());
            hour = lt.getHour();
            min = lt.getMinute();
        }

        return this.obs;
    }

    public static void main(String[] args) {
        Station aStation = new Station();
        System.out.println(aStation.getObservation());
        System.out.println(aStation.getObservation());
    }
}