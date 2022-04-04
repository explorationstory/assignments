package hoofdstuk04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EnumSet;

public class SeasonHotOrColdTest {

    @Test
    void givenSeasonWhenDetermineSeasonThenReturnHot() {

        Season season = new Season();

        String cold = season.determineSeason("winter");

        Assertions.assertEquals("cold", cold);

    }

}
