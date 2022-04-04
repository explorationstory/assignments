package hoofdstuk03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalTime;

public class TimeCalculator {

    private static final Logger log = LoggerFactory.getLogger(TimeCalculator.class);

    public LocalTime calculateTimeAfter(LocalTime currentTime,int passedHours) {

        LocalTime calculatedTime = currentTime.plusHours(passedHours);

        return calculatedTime;
    }

    public int determineDays(LocalTime currenTime, int hoursPassed) {
        int numberOfDaysPassed = hoursPassed / 24;

        log.info("Current time: " + currenTime + "," +
                " after " + hoursPassed + " hours, " +
                numberOfDaysPassed + " days has passed.");
        return numberOfDaysPassed;

    }
}
