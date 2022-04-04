package hoofdstuk04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EnumSet;

class SeasonHotOrColdTest {

    @Test
    void givenSeasonWhenDetermineSeasonThenReturnHot() {

        Season season = new Season();

        String cold = season.determineSeason("fall");

        Assertions.assertEquals("cold", cold);

    }

    @Test
    void givenStringOfSeasonWhenConvertToEnumThenReturnSeasonEnum() {

        Season season = new Season();

        Seasons enumFromString = season.convertToEnum("Fall");

        Assertions.assertEquals(Seasons.WINTER,enumFromString);
    }

}
