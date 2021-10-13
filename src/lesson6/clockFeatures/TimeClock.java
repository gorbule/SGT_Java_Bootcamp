package lesson6.clockFeatures;

import lesson6.clockFeatures.domain.Hour;
import lesson6.clockFeatures.domain.Minute;
import lesson6.clockFeatures.domain.Second;
import lesson6.clockFeatures.domain.MiliSecond;

public class TimeClock {
    private Hour hour;
    private Minute minute;
    private Second second;
    private MiliSecond miliSecond;

    //non argument constructor
    public TimeClock() {
    }

    //argument constructor
    public TimeClock(Hour hour, Minute minute, Second second, MiliSecond miliSecond) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.miliSecond = miliSecond;
    }

    //getters & setters
    public Hour getHour() {
        return hour;
    }

    public void setHour(Hour hour) {
        this.hour = hour;
    }

    public Minute getMinute() {
        return minute;
    }

    public void setMinute(Minute minute) {
        this.minute = minute;
    }

    public Second getSecond() {
        return second;
    }

    public void setSecond(Second second) {
        this.second = second;
    }

    public MiliSecond getMiliSecond() {
        return miliSecond;
    }

    public void setMiliSecond(MiliSecond miliSecond) {
        this.miliSecond = miliSecond;
    }
}
