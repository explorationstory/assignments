package hoofdstuk06;

public class Capacity {

    public long[] doubleCapacityOfLongArray(long[] array) {

        long[] newArray = doubleLongArraySize(array);

        newArray = copyElementFromLongArrayIntoNewArray(array, newArray);

        return newArray;
    }

    public long[] doubleLongArraySize(long[] array){

        long[] newArray = new long[array.length * 2];

        return newArray;
    }

    public long[] copyElementFromLongArrayIntoNewArray(long[] oldLongArray, long[] newLongArray) {

        for(int index = 0;index < oldLongArray.length;index++){
            newLongArray[index] = oldLongArray[index];
        }

        return newLongArray;
    }
}
