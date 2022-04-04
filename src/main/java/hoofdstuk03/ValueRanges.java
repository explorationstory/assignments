package hoofdstuk03;

public class ValueRanges {
    public byte getByteRangeValue(String minOrMax) {

        byte rangeNumber = 0;

        if("min".equalsIgnoreCase(minOrMax)){

            rangeNumber = Byte.MIN_VALUE;

        }else if("max".equalsIgnoreCase(minOrMax)) {

            rangeNumber = Byte.MAX_VALUE;

        } else {

            throw new RuntimeException("No valid condition given. Param must be min or max");
        }

        return rangeNumber;
    }
}
