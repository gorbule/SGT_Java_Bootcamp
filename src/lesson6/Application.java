package lesson6;

import lesson6.clockFeatures.domain.Hour;

public class Application {
    public static void main(String[] args) {
        DigitalClock digitalClock = new DigitalClock();

        String currentTime = digitalClock.showTime();
        System.out.println("Current Time " + currentTime);

        Hour hour = digitalClock.getTimeClock().getHour();
    }
}
