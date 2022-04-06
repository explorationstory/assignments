package hoofdstuk06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class ArrayTests {

    Capacity capacity;

    @BeforeEach
    void setUp() {
      capacity = new Capacity();
    }

    @Test
    void vraag1() {

        long[] row = new long[4];  // Long array met grootte 4
        row[2] = 3;                // { , ,3, }
        long[] copy = row;         // copy wijst naar row adres
        copy[2]++;                 // { , ,4, }

        // what is value of row[4]?
        // indexnr bestaat niet dus ouToFBoundsArray exception?!?
    }

    @Test
    void givenLongArray_whenDoubleArraySize_returnDoubledArraysize() {

        long[] inputValue = {1,2,3,4};

        int valueUnderTest = capacity.doubleLongArraySize(inputValue).length;

        assertThat(valueUnderTest).isEqualTo(8);
    }

    @Test
    void givenLongArray_whenCopyElementsFromLongArrayToNewArray_thenReturnNewArrayWithTwiceSize() {

        long[] inputValueOldArray = {1,2,3,4};
        long[] inputValueNewArray = new long[8];

        long[] valueUndertest = capacity.copyElementFromLongArrayIntoNewArray(
                inputValueOldArray,inputValueNewArray);

        assertThat(valueUndertest).contains(1,2,3,4,0,0,0,0);
    }

    @Test
    void givenDefaultValues_whenIncreaseCapacityOfLongArray_ThenReturnTwiceItsSize() {

        Capacity capacity = new Capacity();

        long[] array = {1,2,3,4};

        long[] doubledLongArray = capacity.doubleCapacityOfLongArray(array);

        assertThat(doubledLongArray).hasSize(8);
    }

}
